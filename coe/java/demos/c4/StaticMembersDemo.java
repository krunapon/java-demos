package coe.java.demos.c4;

public class StaticMembersDemo {
	static final String COURSE_ID = "EN811302"; // static member
	static String courseLocation = "LabC";
	static String grade = "A";

	public static void main(String[] args) {
		String gradeLocal = "B"; // local variable
		System.out.println(Math.PI);
		System.out.println("This course is " + COURSE_ID);
		System.out.println("It takes place at " + courseLocation);
		System.out.println("Grade is" + gradeLocal);
		printGrade(gradeLocal);
	}

	static void printGrade(String gradeLocal) {
		System.out.println("Grade is " + grade + " grade local is " + gradeLocal);
	}
}
