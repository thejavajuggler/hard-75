import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(noOfCoinsToMakeSum(coins, coins.length, amount, dp));
    }

    private static int noOfCoinsToMakeSum(int[] coins, int n, int amount, int[][] dp) {
        if (n == 0)
            return Integer.MAX_VALUE;
        if (amount < 0)
            return Integer.MAX_VALUE;
        if (amount == 0)
            return 0;
        if (dp[n][amount] != -1)
            return dp[n][amount];
        int coinTaken = noOfCoinsToMakeSum(coins, n, amount - coins[n - 1], dp);
        int coinNotTaken = noOfCoinsToMakeSum(coins, n - 1, amount, dp);
        if (coinTaken != Integer.MAX_VALUE)
            coinTaken = coinTaken + 1;

        dp[n][amount] = Integer.min(coinTaken, coinNotTaken);
        return dp[n][amount];
    }
}
