package com.mycompany.app;
import java.util.*;

public class FizzBuzz {

  public static List generate(int length) {

    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i<length; i++) {
      list.add(i + 1);
    }
    return list;
  }
  
}
