import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {1,2,0,1,0,0,0,0};
        int target = 0;
        System.out.println(threeSum(nums, target));
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i -1] == nums[i]) {
                continue;
            }
            int b = target - nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[right] + nums[left];
                if (sum == b) {
                    List<Integer> list = List.of(nums[i], nums[left], nums[right]);
                    resultList.add(list);
                    right--;
                    left++;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    while (left < right && nums[right] == nums[right + 1])
                        right--;

                }
                else if (sum < b) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return resultList;
    }
}
