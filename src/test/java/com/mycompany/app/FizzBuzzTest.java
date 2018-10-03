import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.mycompany.app.FizzBuzz;

import java.util.*;

class FizzBuzzTests {

  @Test public void return1To3() {
  assertEquals(Arrays.asList(1, 2, 3), FizzBuzz.generate(3));
  }
}