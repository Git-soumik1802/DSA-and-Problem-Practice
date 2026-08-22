package mock4;

public class BuyStockandSale {

    public static int BuyandSale(int a[]) {

        int minPrice = a[0];
        int maxProfit = 0;

        for (int i = 1; i < a.length; i++) {

            // Profit if we sell today
            int profit = a[i] - minPrice;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, profit);

            // Update minimum buying price
            minPrice = Math.min(minPrice, a[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(BuyandSale(prices));
    }
}