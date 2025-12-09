package coe.java.demos.c6;

public class Student {
	String name;
	protected int year;
	
	public Student() {
	
	}
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setYear(int y) {
		year = y;
	}
	public int  getYear() {
		return year;
	}
	public String toString() {
		return name + " year " + year;
	}
	
	public void doActivities() {
		System.out.println("Use Facebook");
		System.out.println("Play games");
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Manee");
		s1.setYear(3);
		Student s2 = new Student("Mana", 2);
		System.out.println(s1);
		System.out.println(s2.getName() + " year " +
				s2.getYear());
		s2.doActivities();
	}

}
