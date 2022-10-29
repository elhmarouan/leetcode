package romanToInt;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class RomanToInt {

  private final Map<String, Integer> subtractionsCombinationsMap = Map.of("IV", 4, "IX",
      9, "XL", 40, "XC", 90, "CD", 400, "CM", 900);

  private final Map<String, Integer> romansToIntMap = Map.of("I", 1, "V", 5, "X",
      10, "L", 50, "C", 100, "D", 500, "M", 1000);


  public int romanToInt(String s) {
    AtomicReference<Integer> totalInteger = new AtomicReference<>(0);
    StringBuilder subtractedRoman = new StringBuilder(s);

    while (subtractedRoman.length() > 0) {
      this.calculateMapElements(subtractionsCombinationsMap, totalInteger, subtractedRoman);
      this.calculateMapElements(romansToIntMap, totalInteger, subtractedRoman);
    }

    return totalInteger.get();
  }

  private void calculateMapElements(Map<String, Integer> romanMap, AtomicReference<Integer> totalInteger, StringBuilder subtractedRoman) {
    romanMap.forEach((roman, integer) -> {
      int index = subtractedRoman.indexOf(roman);
      if (index != -1) {
        totalInteger.updateAndGet(v -> v + integer);
        subtractedRoman.delete(index, index + roman.length());
      }
    });
  }

}
