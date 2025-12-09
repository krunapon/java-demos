package coe.java.demos.c2;
public class StringOpsDemo {
	public static void main(String[] args) {
		String s1 = "Khon KaenUniversity";
		String s2 = "University";
		String s3 = "a  KKU  b";
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(5));
		System.out.println(s1.indexOf("Kaen"));
		System.out.println(s2.toLowerCase());
		System.out.println(s3);
		System.out.println(s3.trim());
	}
}
	

	
