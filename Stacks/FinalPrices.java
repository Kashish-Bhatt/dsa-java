import java.util.Scanner;
import java.util.Stack;

public class FinalPrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() > prices[i])
                st.pop();

            if (!st.isEmpty())
                prices[i] -= st.peek();

            st.push(prices[i] + (st.isEmpty() ? 0 : 0));
        }

        for (int x : prices)
            System.out.print(x + " ");
    }
}