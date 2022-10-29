package stocktrader;

import java.util.List;

public class StockTrader {
  public Integer maxProfit(List<Integer> prices) {
    int profit = 0;
      for (int i = 0; i < prices.size(); i++) {
        for (int j = i; j < prices.size(); j++) {
          if (prices.get(j) - prices.get(i) > profit) {
            profit = prices.get(j) - prices.get(i);
          }
        }
      }
      return profit;
  }
}
