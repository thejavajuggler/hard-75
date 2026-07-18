public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] nums = {1, 2, -6, 5};
        System.out.println(maxSubArraySum(nums));
    }

    private static int maxSubArraySum(int[] nums) {
        int currentSum = nums[0];
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            currentSum = Integer.max(nums[i], currentSum + nums[i]);
            maxSum = Integer.max(currentSum, maxSum);
        }
        return maxSum;
    }

}
