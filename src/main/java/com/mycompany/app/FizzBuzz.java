package com.mycompany.app;
import java.util.*;

public class FizzBuzz {

  public static List generate(int length) {

    ArrayList<String> list = new ArrayList<String>();

    String element;

    for (int i = 1; i<=length; i++) {
      element = "";
      if (i % 3 == 0) {
        element += "Fizz";
      }
      if (i % 5 == 0) {
        element += "Buzz";
      }
      if (element == "") {
        list.add(Integer.toString(i));
      } else {
         list.add(element);
      }
    }
    return list;
  }

}
