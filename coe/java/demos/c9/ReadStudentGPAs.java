import java.io.*;
import java.util.*;

public class ReadStudentGPAs {
	public static void main(String[] args) {
		try {
			String filename = "students";
			FileInputStream fileInput = new FileInputStream(filename);
			DataInputStream dataInput = new DataInputStream(fileInput);
			try {
				while (true) {
					String name = dataInput.readUTF();
					double gpa = dataInput.readDouble();
					System.out.println(name + " has GPA as " + gpa);
 				}
			} catch (EOFException ex) {
				dataInput.close();
				fileInput.close();
			}
		} catch (IOException ex2) {
			ex2.printStackTrace(System.err);			
		}
	}
}
