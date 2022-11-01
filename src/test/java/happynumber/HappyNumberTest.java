package happynumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HappyNumberTest {

  private final HappyNumber happyNumber = new HappyNumber();

  @ParameterizedTest
  @CsvSource({"19,true", "2,false"})
  public void test_should_return_if_happy_number(int number, boolean isHappy) {
    // WHEN
    Boolean result = happyNumber.isHappy(number);

    // THEN
    Assertions.assertEquals(result, isHappy);
  }
}
