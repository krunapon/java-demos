package coe.java.demos.c8;
public class FinallyDemo2 {
	  public static void main(String args[]) {
	         FinallyDemo2 obj = new FinallyDemo2();
	         if (obj.myMethod(args) == 1) {
	        	 	System.out.println("The method runs with some problem");
	         }
	  }
	  @SuppressWarnings("finally")
	public int myMethod(String args[]) {
	         try {
	                   System.out.println(args[0]);
	                   System.out.println("The method runs successfully");  
	                   System.exit(0);
	         } catch(ArrayIndexOutOfBoundsException ex) {
	                   System.err.println("There is no first argument");
	         } finally {
	                   System.out.println("Finish executing the method");
	                   return 1;
	         }
	  }
	}

