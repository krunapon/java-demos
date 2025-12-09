package coe.java.demos.c7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListDemo {
  // number of objects to add to list
  static final int SIZE = 1000000;

  static long timeList(List list) {
    long start = System.currentTimeMillis(); // start time
    Object obj = new Object();
    for (int i = 0; i < SIZE; i++) {
      // add object to the end of the list
      list.add(obj);
    }
    return System.currentTimeMillis() - start; // end - start
  }
  public static void main(String args[]) {
    // do timing for LinkedListd
    System.out.println("time for LinkedList = " + 
    		timeList(new LinkedList()));
    // do timing for ArrayList
    System.out.println("time for ArrayList = " + 
    		timeList(new ArrayList()));
  }
}

