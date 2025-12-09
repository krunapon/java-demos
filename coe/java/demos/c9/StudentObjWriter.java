import java.io.*;
public class StudentObjWriter {
	public static void main(String[] args) {
		Student manee = new Student("Manee", 3.2);
		try {
			FileOutputStream fos = new FileOutputStream("output");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(manee);
			oos.writeUTF("Good bye");
			oos.close();
			fos.close();
		} catch (Exception ex){
			ex.printStackTrace(System.err);
		}
	}
}