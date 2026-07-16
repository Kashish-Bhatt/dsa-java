import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!st.isEmpty() && st.peek() == ch)
                st.pop();
            else
                st.push(ch);
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty())
            ans.append(st.pop());

        System.out.println(ans.reverse());
    }
}
