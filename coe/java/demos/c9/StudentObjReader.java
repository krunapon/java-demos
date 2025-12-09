import java.io.*;
public class StudentObjReader {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("output");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// ois.readObject() returns type Object
			Student student =  (Student) ois.readObject();
			String name = student.getName();
			Double gpa = student.getGPA();
			System.out.println("Student " + name + " has gpa = "
					+ gpa);
			String string = ois.readUTF();
			System.out.println(string);
		} catch (Exception ex){
			ex.printStackTrace(System.err);
		}
	}
}
