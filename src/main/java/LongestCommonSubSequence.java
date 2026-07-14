import java.util.Arrays;

public class LongestCommonSubSequence {

    public static void main(String[] args) {
        String text1 = "abc";
        String text2 = "def";

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(longestCommonSubSequence(text1, text2, text1.length(), text2.length(), dp));
    }

    private static int longestCommonSubSequence(String text1, String text2, int n, int m, int[][] dp) {
        if (n == 0 || m == 0)
            return 0;
        if (dp[n][m] != -1)
            return dp[n][m];
        if (text1.charAt(n - 1) == text2.charAt(m - 1))
            dp[n][m] = 1 + longestCommonSubSequence(text1, text2, n - 1, m - 1, dp);
        else {
            dp[n][m] = Integer.max(longestCommonSubSequence(text1, text2, n - 1, m, dp),
                    longestCommonSubSequence(text1, text2, n, m - 1, dp));
        }
        return dp[n][m];
    }
}
