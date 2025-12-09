package coe.java.demos.c6;

public class Student2 {
	protected String name;
	int year;
	public Student2() {}
	
	public Student2(String name) {
		this.name = name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name;
	}
	public void doActivities() {
		System.out.println("Reading Books");
		System.out.println("Using Facebooks");
	}
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2("Mana");
		s2.name = "Chujai";
		s1.setName("Manee");
		System.out.println(s1);
		System.out.println(s2);
		s2.doActivities();
	}

}
