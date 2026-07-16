import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i % n])
                st.pop();

            if (i < n) {
                if (st.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = st.peek();
            }

            st.push(nums[i % n]);
        }

        for (int x : ans)
            System.out.print(x + " ");
    }
}
