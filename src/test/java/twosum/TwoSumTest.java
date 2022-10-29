package twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

  private final TwoSum twoSum = new TwoSum();

  @Test
  public void shouldCalculateTwoSum() {
   // GIVEN
    int[] numbersInput = new int[]{2,7,11,15};
    int target = 9;
    int[] expectedResult = new int[]{0,1};

   // WHEN
    int[] result = twoSum.twoSum(numbersInput, target);
   // THEN
    Assertions.assertArrayEquals(result, expectedResult);
  }

  @Test
  public void shouldCalculateTwoSum2() {
    // GIVEN
    int[] numbersInput = new int[]{3,2,4};
    int target = 6;
    int[] expectedResult = new int[]{1,2};

    // WHEN
    int[] result = twoSum.twoSum(numbersInput, target);
    // THEN
    Assertions.assertArrayEquals(result, expectedResult);
  }


  @Test
  public void shouldCalculateTwoSum3() {
    // GIVEN
    int[] numbersInput = new int[]{3,3};
    int target = 6;
    int[] expectedResult = new int[]{0,1};

    // WHEN
    int[] result = twoSum.twoSum(numbersInput, target);

    // THEN
    Assertions.assertArrayEquals(result, expectedResult);
  }

}
