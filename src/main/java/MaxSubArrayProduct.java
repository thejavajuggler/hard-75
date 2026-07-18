public class MaxSubArrayProduct {

    public static void main(String[] args) {
        int[] nums = {1,2,3,0,-1};
        System.out.println(maxSubArrayProduct(nums));
    }

    private static int maxSubArrayProduct(int[] nums) {
        int left = 1;
        int right = 1;
        int maxProductSubArray = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (left == 0)
                left = 1;
            if (right == 1)
                right = 1;
            left = left * nums[i];
            right = right * nums[nums.length - 1 - i];
            maxProductSubArray = Integer.max(maxProductSubArray, Integer.max(left, right));
        }
        return maxProductSubArray;
    }
}
