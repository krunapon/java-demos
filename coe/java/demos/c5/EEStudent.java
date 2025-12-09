package coe.java.demos.c5;
import coe.java.demos.c6.Student;
public class EEStudent extends Student {
	public EEStudent(String n) {
		super(n);
	}
	
	public static void main(String[] args) {
		EEStudent e1 = new EEStudent("David");
		//e1.name = "Steve";
		e1.year = 3;
	}

}
