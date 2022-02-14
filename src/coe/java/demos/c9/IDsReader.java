package coe.java.demos.c9;
import java.util.*;
import java.io.*;
public class IDsReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name, ID;
		Map<String,String> nameIDs
		= new HashMap<String,String>();
		// reading and putting into the hashmap
		while (in.hasNext()) {
			name = in.next();
			ID = in.next();
			nameIDs.put(name,ID);
		}

		try {
			FileWriter fw = new FileWriter("StudentsID.txt");
			PrintWriter pw = new PrintWriter(fw);
			// displaying on the console and writing to file
			for (String n : nameIDs.keySet()) {
				String id = nameIDs.get(n);
				System.out.println(n + " has ID " + id);
				pw.println(n + " " + id);
			}
			fw.close();
			pw.close();
		} catch (IOException ex) {
			System.err.println("Error in writing file");
			ex.printStackTrace(System.err);
		}
	}
}
// Write characters
// FileWriter, PrintWriter
// Read characters
// FileReader, BufferedReader
// Write Java primitive types, such as double, int
// FileOutputStream, DataOutputStream
// Read Java primitive types
// FileInputStream, DataInputStream
// Write Java objects, such as Student s, Book b
// FileOutputStream, ObjectOutputStream
// Read Java objects
// FileInputStream, ObjectInputStream
// class Student, Book needs to be serializable
// class Student implements Serializable {...}