package coe.java.demos.c2;

class Student {
	// data or attributes
	public static String universityName;
	public String ID;
	public String name;

	// subroutines or functions
	public void takeCourses(String courseName) { }
	public static void  liveIn() {} 
	public void printInfo() {
		System.out.println("ID = " + ID);
		System.out.println("Name = " + name);
		System.out.println("University name = " + universityName);
	}
}

public class StaticConceptDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.ID = "1234";
		s1.name = "Manee";
		Student.universityName = "KKU";  
		s1.printInfo();
		s2.ID = "7890";
		s2.name = "Mana";
		s2.printInfo();
	}
}
