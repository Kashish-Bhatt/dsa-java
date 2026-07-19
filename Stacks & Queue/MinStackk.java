import java.util.Scanner;
import java.util.Stack;

class Pair {
    int val;
    int min;

    Pair(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

public class MinStackk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Pair> st = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();

            if (st.isEmpty()) {
                st.push(new Pair(val, val));
            } else {
                int minimum = Math.min(val, st.peek().min);
                st.push(new Pair(val, minimum));
            }
        }

        System.out.println("Top Element: " + st.peek().val);
        System.out.println("Minimum Element: " + st.peek().min);

        st.pop();

        System.out.println("After Pop:");
        System.out.println("Top Element: " + st.peek().val);
        System.out.println("Minimum Element: " + st.peek().min);
    }
}