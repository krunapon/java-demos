package coe.java.demos.c4;

public class NumbersSwapper2 {

	static void swap(int[] nums) {
	      System.out.println("Inside swap method");
	       System.out.println("Before swapping m is " + nums[0] + " n is " + nums[1]);
	       // Swapping m with n
	       int temp = nums[0];
	       nums[0] = nums[1];
	       nums[1] = temp;
	 System.out.println("After swapping m is " + 
			 nums[0] + " n is " + nums[1]);
	}

	public static void main(String[] args) {
		   int[] nums = {2, 3};
		   System.out.println("Before invoking the swap method: m is " + nums[0] + " n is " + nums[1]);
		   swap(nums);
		   System.out.println("After invoking the swap method: m is  " + nums[0] + " n is " + nums[1]);
		   	
		}
}
