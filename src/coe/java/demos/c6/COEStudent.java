package coe.java.demos.c6;

public class COEStudent extends Student {
	private String progLan;
	
	public COEStudent(String name, int year) {
		// constructor of super class
		super(name, year);
	}
	public void setProgLan(String p) {
		progLan = p;
	}
	public String getProgLan() {
		return progLan;
	}
	public void doActivities() {
		super.doActivities();
		System.out.println("Writing programs");
	}
	public static void main(String[] args) {
		COEStudent c1 = new COEStudent("Chujai", 2);
		System.out.println(c1);
		c1.doActivities();
	}
}
