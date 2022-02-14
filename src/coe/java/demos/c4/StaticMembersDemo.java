package coe.java.demos.c4;

public class StaticMembersDemo {
	static final String COURSE_ID = "188230"; // static member
	static String courseLocation;
	static void hello() {
		System.out.println(COURSE_ID);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String grade = "A"; // local variable
		System.out.println("This course is " + COURSE_ID);
		System.out.println("It takes place at " + courseLocation);
		System.out.println("Grade is" + grade);
	}
}
