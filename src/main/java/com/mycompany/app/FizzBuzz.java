package com.mycompany.app;
import java.util.*;

public class FizzBuzz {

  public static List generate(int length) {

    ArrayList<String> list = new ArrayList<String>();
    for (int i = 1; i<=length; i++) {
      if (i % 3 == 0) {
        list.add("Fizz");
      } else {
        list.add(Integer.toString(i));
      }
    }
    return list;
  }
  
}
