import java.util.*;
import java.io.*;

public class Covid19 {
	public static void main(String[] args) {
		try {
			String filename = "covid19";
			System.out.println("Start to write file " + filename);
			// open streams to write byte-stream or machine-formatted data
			FileOutputStream fileOutput = new FileOutputStream(filename);
			DataOutputStream dataOutput = new DataOutputStream(fileOutput);
			Map<String, Integer> countries = new HashMap<String, Integer>();
			countries.put("Italy", 23073);
			countries.put("Iran", 9142);
			// books.keySet() returns all the keys in collection "books"
			// use for loop to get each key
			for (String country : countries.keySet()) {
				// use get(key) to get the value of the specified key
				Integer activeCases = countries.get(country);
				dataOutput.writeUTF(country);
				dataOutput.writeInt(activeCases);
			}
			dataOutput.close();
			fileOutput.close();
			System.out.println("Finish writing to file " + filename);
		} catch (IOException ex) {
			ex.printStackTrace(System.err);
		}
	}
}
