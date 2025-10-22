package ARRAYS;

public class LC268_MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;

        int s2 = 0;
        for (int i = 0; i < nums.length; i++) {
            s2 += nums[i];
        }

        return sum - s2;
    }

    public static void main(String[] args) {
        LC268_MissingNumber obj = new LC268_MissingNumber();

        int[] nums = {3, 0, 1};  // Expected missing number = 2
        int missing = obj.missingNumber(nums);

        System.out.println("Missing number is: " + missing);
    }
}
