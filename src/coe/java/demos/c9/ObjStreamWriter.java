package coe.java.demos.c9;
import java.io.*;
public class ObjStreamWriter {
	public static void main(String[] args) {
		Book b = new Book("B00001", 23.0);
		try {
			FileOutputStream fos = new FileOutputStream("output");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b);
			oos.writeDouble(3.94);
			oos.writeUTF("Generous");
			oos.close();
			fos.close();
		} catch (Exception ex){
			ex.printStackTrace(System.err);
		}
	}
}
