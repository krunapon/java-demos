package coe.java.demos.c2;
/**
 * This program performs some mathematical computations and displays
 * the results.  It then reports the number of seconds that the 
 * computer spent on this task.
 */

public class TimedComputation {
   
   public static void main(String[] args) {
   
      long startTime; // Starting time of program, in milliseconds.
      long endTime;   // Time when computations are done, in milliseconds.
      double time;    // Time difference, in seconds.
      
      startTime = System.currentTimeMillis();
      
      double width, height, hypotenuse;  // sides of a triangle
      width = 3.0;
      height = 4.0;
      hypotenuse = Math.sqrt( width*width + height*height );
      System.out.print("A triangle with sides 3 and 4 has hypotenuse ");
      System.out.println(hypotenuse);
      
      
      System.out.print("\nHere is a random number:  ");
      System.out.println( Math.random() );
      
      endTime = System.currentTimeMillis();
      time = (endTime - startTime) / 1000.0;
      
      System.out.print("\nRun time in seconds was:  ");
      System.out.println(time);
   
   } // end main()
   
} // end class TimedComputation
