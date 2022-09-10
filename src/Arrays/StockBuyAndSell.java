package Arrays;

public class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int cp = prices[0];
        int sp = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < prices[i - 1]) {
                if(sp != 0) {
                    sum += (sp - cp);
                    sp = 0;
                }
                cp = prices[i];
            }else if(prices[i] > prices[i - 1]) {
                sp = prices[i];
            }
            if(i == prices.length - 1 && sp != 0) {
                sum += (sp - cp);
            }
        }
        return sum;
    }
    public int maxProfit2(int[] prices) {
        int buyValue = prices[0];
        int netProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buyValue) {
                buyValue = prices[i];
            }else {
                netProfit += (prices[i] - buyValue);
                buyValue = prices[i];
            }
        }
        return netProfit;
    }

    public int maxProfit3(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1])
                profit += (prices[i] - prices[i - 1]);
        }
        return profit;
    }
}
