package coe.java.demos.c2;

//package coe.java.demos.c2;
public class StringOpsDemo {
	public static void main(String[] args) {
		String s1 = "KhonKaenUniversity";
		String s2 = " University ";
		String s3 = "    a  KKU  b    ";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.length());
		System.out.println(s2.charAt(5));
		System.out.println(s1.indexOf("kaen"));
		System.out.println(s2.toLowerCase());
		System.out.println(s3);
		System.out.println(s3.trim());
		System.out.println(s1.substring(5));
	}
}
	

	
