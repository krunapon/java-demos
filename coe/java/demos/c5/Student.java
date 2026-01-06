package coe.java.demos.c5;

class Student {
	public String name; // Student’s name.
	public double test1, test2, test3; // Grades on three tests.
	public double getAverage() { // compute average test grade
		return (test1 + test2 + test3) / 3;}
	public static void main(String[] args) {
		Student std1, std2, std3; // type Student.
		std1 = new Student();
		std3 = null;
		std1.name = "David";
		std2 = new Student();
		std2.name = "John";
		System.out.println("std1.name = " + std1.name);
		System.out.println("std2.name = " + std2.name);
		System.out.println("std1 = " + std1 + " std2 = " + std2);
		if (std1 == std2) {
			System.out.println("std1 is equal to std2");
		} else {
			System.out.println("std1 is not equal to std2");
		}
	}

}
