package coe.java.demos.c7;

import java.util.Arrays;

public class ArrayUtilMethodsDemo {
      public static void main(String args[]) {
         double d[] = {3.8, 3.6, 3.5, 2.6, 3.9};
         System.out.println("Before sorting:");
         ArrayUtil.display(d);
         Arrays.sort(d);
         System.out.println("After sorting");
         ArrayUtil.display(d);
         int i = Arrays.binarySearch(d,3.9);
         System.out.println("Searching for 3.9 which is found at:" + i);
         Arrays.fill(d,3.5);
         System.out.println("After filling with 3.5");
         ArrayUtil.display(d);
      }
}
