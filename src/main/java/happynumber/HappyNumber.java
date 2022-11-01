package happynumber;

import java.util.List;

public class HappyNumber {

  public boolean isHappy(int number) {
    int result = number;
    while (result != 1) {
      result = sumOfSquares(result);
    }
    return true;
  }

  private int sumOfSquares(int number) {
    List<Integer> digitsList = toDigitsList(number);
    return digitsList.stream().mapToInt(x -> x * x).sum();
  }

  private List<Integer> toDigitsList(int number) {
    return Integer.toString(number).chars().map(c -> c-'0').boxed().toList();
  }
}
