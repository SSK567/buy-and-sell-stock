public class Main {
    public class BuyAndSellStock {
        public static int maxProfit(int[] prices) {
            // Initialize variables to track the minimum price and maximum profit
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
    
            // Iterate through the prices array
            for (int price : prices) {
                // Update the minimum price if the current price is lower
                if (price < minPrice) {
                    minPrice = price;
                }
                // Calculate the profit if we sell at the current price
                int profit = price - minPrice;
                // Update the maximum profit if the current profit is higher
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
    
            return maxProfit;
        }
    
        public static void main(String[] args) {
            int[] prices = {7, 1, 5, 3, 6, 4};
            int result = maxProfit(prices);
            System.out.println("Maximum profit: " + result); // Output: 5
        }
    }
    
}
