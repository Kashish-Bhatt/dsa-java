import java.util.Scanner;
import java.util.Stack;

public class RemoveKdigits {

    public static String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.next();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        String ans = removeKdigits(num, k);

        System.out.println("Smallest Number = " + ans);

        sc.close();
    }
}