public class LongestIncreasingSubSequence {

    public static void main(String[] args) {

        int[] nums = {10,9,2,5,3,7,101,18};
        int longestIncreasingSubsequence = longestIncreasingSubsequence(nums,0, -1);
        System.out.println(longestIncreasingSubsequence);
    }

    private static int longestIncreasingSubsequence(int[] nums, int index, int previousIndex) {
        if (index == nums.length)
            return 0;
        int notTake = longestIncreasingSubsequence(nums, index + 1, previousIndex);
        int take = 0;
        if (previousIndex == -1 || nums[index] > nums[previousIndex]) {
            take = 1 + longestIncreasingSubsequence(nums, index + 1,  index);
        }
        return Integer.max(take, notTake);
    }
}
