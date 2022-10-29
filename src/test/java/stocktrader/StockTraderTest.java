package stocktrader;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StockTraderTest {

  private final StockTrader stockTrader = new StockTrader();

  @Test
  public void test1_shouldReturnMaxProfit() {
    // GIVEN
    List<Integer> prices = List.of(7,1,5,3,6,4);
    Integer expectedResult = 5;

    // WHEN
    Integer result = stockTrader.maxProfit(prices);

    // THEN
    Assertions.assertEquals(result, expectedResult);
  }

  @Test
  public void test2_shouldReturnMaxProfit() {
    // GIVEN
    List<Integer> prices = List.of(7,6,4,3,1);
    Integer expectedResult = 0;

    // WHEN
    Integer result = stockTrader.maxProfit(prices);

    // THEN
    Assertions.assertEquals(result, expectedResult);
  }

  @Test
  public void test3_shouldReturnMaxProfit() {
    // GIVEN
    List<Integer> prices = List.of(3,9,2,4,5);
    Integer expectedResult = 6;

    // WHEN
    Integer result = stockTrader.maxProfit(prices);

    // THEN
    Assertions.assertEquals(result, expectedResult);
  }
}
