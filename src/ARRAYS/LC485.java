package ARRAYS;

public class LC485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                max = Math.max(cnt, max);
            } else {
                cnt = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LC485 sol = new LC485();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(sol.findMaxConsecutiveOnes(nums));
    }
}
