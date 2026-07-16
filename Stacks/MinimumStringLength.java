import java.util.Scanner;
import java.util.Stack;

public class MinimumStringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!st.isEmpty()) {

                char top = st.peek();

                if ((top == 'A' && ch == 'B') ||
                    (top == 'C' && ch == 'D')) {
                    st.pop();
                } else {
                    st.push(ch);
                }

            } else {
                st.push(ch);
            }
        }

        System.out.println(st.size());
    }
}