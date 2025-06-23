public class Exercise {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; // minimum price to buy
        int maxProfit = 0;        // maximum profit

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                System.out.println("Found new lower price to buy: " + minPrice + " on day " + i);
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    System.out.println("New best profit: " + profit + " by selling at " + prices[i] + " on day " + i);
                }
            }
        }

        return maxProfit;
    }
}

class MAIN {
    public static void main(String args[]) {
        Exercise obj1 = new Exercise();
        int[] array = {2, 5, 1, 6, 9, 8};
        int result = obj1.maxProfit(array);
        System.out.println("Maximum Profit: " + result);
    }
}
