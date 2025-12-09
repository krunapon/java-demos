import java.io.*;
import java.util.*;

public class WriteStudentGPAs {
	public static void main(String[] args) {
		Scanner in;
		try {
			FileOutputStream fileOutput = new FileOutputStream("students");
			DataOutputStream dataOutput = new DataOutputStream(fileOutput);
			in = new Scanner(System.in);
			// hasNext() is to check whether there's more data to read
			while (in.hasNext()) {
				// next() is to get data that we read
				String line = in.nextLine();
				//System.out.println(line); // the whole line
				String[] words = line.split(" ");
				//System.out.println(words[0]); // name
				//System.out.println(words[1]); // GPA
				dataOutput.writeUTF(words[0]);
				dataOutput.writeDouble(Double.parseDouble(words[1]));
			}
			dataOutput.close();
			fileOutput.close();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
