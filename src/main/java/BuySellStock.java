public class BuySellStock {

    public static void main(String[] args) {
        int prices[] = {2,1,4};
        System.out.println(maximumProfit(prices));
    }

    private static int maximumProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = prices[0];
        int currentProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyingPrice)
                buyingPrice = prices[i];
            else {
                currentProfit = prices[i] - buyingPrice;
                maxProfit = Integer.max(maxProfit, currentProfit);
            }

        }
        return maxProfit;

    }


}
