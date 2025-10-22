package ARRAYS;

import java.util.*;

public class LC283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = -1;

        // Step 1: Find index of first 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, return (nothing to move)
        if (j == -1) return;

        // Step 2: Move non-zero elements forward
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        LC283_MoveZeroes obj = new LC283_MoveZeroes();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before: " + Arrays.toString(nums));
        obj.moveZeroes(nums);
        System.out.println("After:  " + Arrays.toString(nums));
    }
}
