import java.util.Scanner;

public class TrappingRainWater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int l = 0;
        int r = height.length - 1;

        int lmax = 0;
        int rmax = 0;

        int total = 0;

        while (l < r) {

            if (height[l] <= height[r]) {

                if (lmax > height[l]) {
                    total += lmax - height[l];
                } else {
                    lmax = height[l];
                }

                l++;
            } else {

                if (rmax > height[r]) {
                    total += rmax - height[r];
                } else {
                    rmax = height[r];
                }

                r--;
            }
        }

        System.out.println("Total Trapped Water = " + total);
    }
}