import java.util.Arrays;

public class UniquePaths {

    public static void main(String[] args) {
        int m = 3, n = 7;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(findNumberOfUniquePaths(m - 1, n - 1, m , n, dp));
    }

    private static int findNumberOfUniquePaths(int start, int end, int m, int n, int[][] dp) {
        if (start == 0|| end == 0)
            return 1;
        if (start < 0 || end < 0)
            return 0;
        if (dp[start][end] != -1)
            return dp[start][end];
        dp[start][end] =  findNumberOfUniquePaths(start - 1, end, m, n, dp) + findNumberOfUniquePaths(start, end - 1, m, n, dp);
        return dp[start][end];
    }
}
