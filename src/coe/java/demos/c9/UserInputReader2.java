package coe.java.demos.c9;

import java.util.*;

public class UserInputReader2 {
	public static void main(String[] args) {
		Scanner in;
		in = new Scanner(System.in);
		// hasNext() is to check whether there's more data to read
		while (in.hasNext()) {
			// next() is to get data that we read
			String line = in.nextLine();
			System.out.println(line);
		}
	}
}
