package romanToInt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanToIntTest {

  private final RomanToInt romanToInt = new RomanToInt();

  @Test
  public void test_should_transform_single_roman_letter_to_int() {
    // GIVEN
    String input = "I";

    // WHEN
    Integer result = romanToInt.romanToInt(input);

    // THEN
    Assertions.assertEquals(result, 1);
  }

  @ParameterizedTest
  @CsvSource({"IV,4", "LVIII,58", "MCMXCIV,1994"})
  public void test_should_transform_multiple_roman_letter_to_int(String roman, Integer integer) {
    // WHEN
    Integer result = romanToInt.romanToInt(roman);

    // THEN
    Assertions.assertEquals(result, integer);
  }

}
