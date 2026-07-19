public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJunp(nums));
    }

    private static boolean canJunp(int[] nums) {
        int finalPosition = nums.length - 1;
        for (int i = nums.length - 2; i >= 0 ; i--) {
            if (i + nums[i] >= finalPosition)
                finalPosition = i;
        }
        if(finalPosition == 0)
            return true;
        return false;
    }
}
