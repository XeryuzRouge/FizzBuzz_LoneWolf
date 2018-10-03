import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.mycompany.app.FizzBuzz;

import java.util.*;

class FizzBuzzTests {

  @Test public void getFizzForMultipliersOf3() {

    List<String> list = FizzBuzz.generate(12);

    for (int i : Arrays.asList(3, 6, 9, 12)) {
      assertEquals("Fizz", list.get(i-1));
    }
  }

}