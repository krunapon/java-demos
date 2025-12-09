package coe.java.demos.c5.part1;

public class Test {
	public String toString() {
		return "Test object";
	} 
	public void displayMsg() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		t.displayMsg();
	}
}
