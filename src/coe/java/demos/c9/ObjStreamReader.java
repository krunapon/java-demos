package coe.java.demos.c9;
import java.io.*;
public class ObjStreamReader {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("output");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// ois.readObject() returns type Object
			Book b =  (Book) ois.readObject();
			String id = b.getID();
			Double price = b.getPrice();
			System.out.println("Book ID " + id + " has price = "
					+ price);
			Double num = ois.readDouble();
			System.out.println("Number is " + num);
			String utf = ois.readUTF();
			System.out.println(utf);
		} catch (Exception ex){
			ex.printStackTrace(System.err);
		}
	}
}
