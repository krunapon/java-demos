package coe.java.demos.c5.part1;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// object s1 in class Student
		Student s1 = new Student();
		s1.setID("1234");
		s1.setName("Thana");
		s1.setGPA(3.25);
		
		Student s2 = new Student();
		s2.setID("1122");
		s2.setName("Somchai");
		s2.setGPA(2.90);
		
		s1.showDetails();
		s2.showDetails();

	}

}
