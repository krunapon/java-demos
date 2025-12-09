package coe.java.demos.c8;
class Student {
	private String name;
	public Student() {
		name = "Chanapat";
	}
	public String getName() {
		return name;
	}
}
public class AssertDemo2 {
	public static Student getStudent() {
		return new Student();
	}
	public static void main(String[] args) {
// 		Student s = getStudent();
		Student s = null;
		assert (s != null);
		if (s.getName().equals("Chanapat")) {
		    System.out.println("Please pay attention in class");
		}
	}
}
