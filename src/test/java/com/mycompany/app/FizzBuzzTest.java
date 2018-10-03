import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.mycompany.app.FizzBuzz;

import java.util.*;

class FizzBuzzTests {

  public List<String> list;

  @BeforeEach public void setupFizzBuzzList() {
    list = FizzBuzz.generate(100);
  }

  @Test public void getFizzForMultipliersOf3() {
    for (int i : Arrays.asList(3, 6, 9, 12, 57, 93)) {
      assertEquals("Fizz", list.get(i-1), Integer.toString(i));
    }
  }

  @Test public void getBuzzForMultipliersOf5() {
    for (int i : Arrays.asList(5, 10, 20, 35, 40, 50, 95)) {
      assertEquals("Buzz", list.get(i-1), Integer.toString(i));
    }
  }

  @Test public void getFizzAndBuzzForMultipliersOf3And5() {
    for (int i : Arrays.asList(15, 30, 45, 60, 75, 60, 90)) {
      assertEquals("FizzBuzz", list.get(i-1), Integer.toString(i));
    }
  }

  @Test public void getIntegerForNotMultipliersOf3Or5() {
    for (int i : Arrays.asList(7, 22, 31, 47, 53, 68, 79, 82, 94)) {
      assertEquals(Integer.toString(i), list.get(i-1), Integer.toString(i));
    }
  }

}