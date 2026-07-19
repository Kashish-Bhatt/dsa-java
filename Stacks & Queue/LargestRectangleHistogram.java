import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleHistogram {

    public static int largestRectangleArea(int[] heights) {
        int[] left = prevsmall(heights);
        int[] right = nextsmall(heights);

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static int[] prevsmall(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] left = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        return left;
    }

    public static int[] nextsmall(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] right = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = heights.length;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }

        return right;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bars: ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int ans = largestRectangleArea(heights);

        System.out.println("Largest Rectangle Area = " + ans);

        sc.close();
    }
}