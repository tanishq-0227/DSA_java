package ARRAYS;

import java.util.Scanner;

public class array_is_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }

        if (n > 0 && nums[n - 1] > nums[0]) {
            count++;
        }

        if (count <= 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
