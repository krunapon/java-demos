package coe.java.demos.c9;
import java.io.*;
public class UserInputReader1 {
	public static void main(String[] args) {
		BufferedReader in; 
        in = new BufferedReader(new InputStreamReader(System.in));
        try {
           String line = in.readLine();
           while ( line != null && line.length() > 0 ) {
              System.out.println(line);
              line = in.readLine();
           }
        }
        catch (IOException e) {
        	e.printStackTrace(System.err);
        }
	}
}
