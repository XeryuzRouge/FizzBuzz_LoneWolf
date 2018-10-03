import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.mycompany.app.FizzBuzz;

import java.util.*;

class FizzBuzzTests {

  @Test public void getFizzForMultipliersOf3() {

    List<String> list = FizzBuzz.generate(93);

    for (int i : Arrays.asList(3, 6, 9, 12, 57, 93)) {
      assertEquals("Fizz", list.get(i-1), Integer.toString(i-1));
    }
  }

  @Test public void getBuzzForMultipliersOf5() {

    List<String> list = FizzBuzz.generate(50);

    for (int i : Arrays.asList(5, 10, 20, 35, 40, 50)) {
      assertEquals("Buzz", list.get(i-1), Integer.toString(i-1));
    }
  }

}