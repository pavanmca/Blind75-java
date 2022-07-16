public class BestTimeToBuyAndSellStock_Day4 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    // Brute Force
    // Time Complexity - O(n^2)
    // Space Complexity - O(1)
    // public static int maxProfit(int[] prices) {
    // int maxProfit = 0;
    // for (int buyIndex = 0; buyIndex < prices.length; buyIndex++) {
    // for (int sellIndex = buyIndex + 1; sellIndex < prices.length; sellIndex++) {
    // maxProfit = Math.max(maxProfit, prices[sellIndex] - prices[buyIndex]);
    // }
    // }
    // return maxProfit;
    // }

    // Optimal Solution
    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentMin = Integer.MAX_VALUE;
        for (int pricesIndex = 0; pricesIndex < prices.length; pricesIndex++) {
            currentMin = Math.min(currentMin, prices[pricesIndex]);
            maxProfit = Math.max(maxProfit, prices[pricesIndex] - currentMin);
        }
        return maxProfit;
    }
}