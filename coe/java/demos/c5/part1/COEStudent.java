package coe.java.demos.c5.part1;
import coe.java.demos.c6.Student2;
public class COEStudent extends Student2 {

	public void doActivities() {
		super.doActivities();
		System.out.println("Writing programs");
	}
	
	public static void main(String[] args) {
		COEStudent c = new COEStudent();
		c.setName("David");
		c.doActivities();
	}
}
