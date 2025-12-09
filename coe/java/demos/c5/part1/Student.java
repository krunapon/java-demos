package coe.java.demos.c5.part1;

public class Student {
	// declare attributes
	private String id = "1234";
	private String name = "Thana";
	private double gpa = 3.25;
	// static variable = class variable
	private static double minGPA = 2.0;
	
	// declare and define methods
	public void setID(String ID) {
		id = ID;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setGPA(double GPA) {
		gpa = GPA;
	}
	
	public void showDetails() {
		System.out.println("name = " + name);
		System.out.println("ID = " + id);
		System.out.println("GPA = " + gpa);
	}
}
