package coe.java.demos.c9;

import java.util.Scanner;
import java.io.*;
public class AddNumbers {
	public static void main(String[] args) {
		int n1, n2, result;
		try {
			FileWriter fw = new FileWriter("out1.txt");
			PrintWriter pw = new PrintWriter(fw);
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter two numbers:");
			do {
				n1 = scanner.nextInt();
				if (n1 < 0) 
					break;
				n2 = scanner.nextInt();
				result = n1 + n2;
				String str = n1 + " + " + n2 + 
					" = " + result;
				System.out.println(str);
				pw.println(str);
				System.out.print("Enter two numbers:");
			} while (scanner.hasNext());
			pw.close();
		} catch (IOException ioex) {
			System.err.println(ioex);
		}
	}

}
