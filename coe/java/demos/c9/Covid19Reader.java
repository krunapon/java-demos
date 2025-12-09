

import java.io.*;
import java.util.*;

public class Covid19Reader {
	public static void main(String[] args) {
		DataInputStream dataInput = null;
		FileInputStream fileInput = null;
		try {
			String filename = "covid19";
			fileInput = new FileInputStream(filename);
			dataInput = new DataInputStream(fileInput);
			try {
				while (true) {
					String name = dataInput.readUTF();
					Integer cases = dataInput.readInt();
					System.out.println(name + " has active cases as " + cases);
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
