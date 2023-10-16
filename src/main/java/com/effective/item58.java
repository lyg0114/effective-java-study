package com.effective;

import java.util.ArrayList;

/**
 * @author : iyeong-gyo
 * @package : com.effective
 * @since : 16.10.23
 */
public class item58 {

  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    integers.add(4);
    integers.add(5);
    integers.add(6);

    for (Integer integer : integers) {
      System.out.println("integer = " + integer);
    }

    integers.removeIf(i -> i == 4);

    System.out.println("###########################");
    System.out.println("###########################");
    System.out.println("###########################");

    for (Integer integer : integers) {
      System.out.println("integer = " + integer);
    }
  }

}
