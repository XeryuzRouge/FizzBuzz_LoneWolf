import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.mycompany.app.FizzBuzz;

import java.util.*;

class FizzBuzzTests {

  @Test public void generate1To10List() {
  assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), FizzBuzz.generate(10));
  }

}