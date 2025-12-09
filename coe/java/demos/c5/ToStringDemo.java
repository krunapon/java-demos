package coe.java.demos.c5;

class Teacher {
	String name;
	Teacher() {
		name = "Kru Jaidee";
	}
	Teacher(String n) {
		name = n;
	} 
	// override method toString in class Object
	public String toString() {
		return name;
	}
}

class UnderGradStudent {
	String name;
	UnderGradStudent() {
		name = "Nakraen Deejai";
	}
	UnderGradStudent(String n) {
		name = n;
	}
	public String toString() {
		return name;
	}
}

// extends class Object
class KKUStudent {
	String name;
}
public class ToStringDemo {
	public static void main(String[] args) {
		KKUStudent kku = new KKUStudent();
		// call kku.toString()
		System.out.println(kku);
		System.out.println(kku.toString());
		Teacher t = new Teacher("Kanda");
		UnderGradStudent ugs = new UnderGradStudent("Wanchai");
		System.out.println("Teacher " + t);
		System.out.println("Undergrad Student " 
				+ ugs);
	}

}
