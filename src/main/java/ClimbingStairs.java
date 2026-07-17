import java.util.Arrays;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(waysToClimbStairs(n, dp));
    }

    private static int waysToClimbStairs(int n, int[] dp) {
        if (n == 0 || n == 1 || n == 2) {
            dp[n] = n;
            return dp[n];
        }
        if (dp[n] != -1)
            return dp[n];
        dp[n] = waysToClimbStairs(n - 2, dp) + waysToClimbStairs(n - 1, dp);
        return dp[n];
    }
}
