public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(indexOfTarget(nums, target, 0, nums.length - 1));
    }

    private static int indexOfTarget(int[] nums, int target, int left, int right) {
        if (left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if (target == nums[mid])
            return mid;
        if (nums[mid] >= nums[left]) {
            if (target <= nums[mid] && target >= nums[left]) {
                return indexOfTarget(nums, target, left, mid);
            }
            else {
                return indexOfTarget(nums, target, mid + 1, right);
            }
        }
        else {
            if (target >= nums[mid] && target <= nums[right]) {
               return indexOfTarget(nums, target, mid + 1, right);
            }
            else {
                return indexOfTarget(nums, target, left, mid);
            }
        }
    }

}
