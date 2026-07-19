import java.util.Scanner;

public class Celebrity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[][] M = new int[n][n];

        System.out.println("Enter matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int down = n - 1;

        // Find candidate
        while (top < down) {

            if (M[top][down] == 1) {
                top++;
            }

            else if (M[down][top] == 1) {
                down--;
            }

            else {
                top++;
                down--;
            }
        }

        int candidate = top;

        boolean celebrity = true;

        // Verify candidate
        for (int i = 0; i < n; i++) {

            if (i != candidate) {

                if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                    celebrity = false;
                    break;
                }

            }
        }

        if (celebrity) {
            System.out.println("Celebrity is: " + candidate);
        } else {
            System.out.println("No Celebrity");
        }

        sc.close();
    }
}
