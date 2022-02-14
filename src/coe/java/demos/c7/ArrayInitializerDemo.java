package coe.java.demos.c7;

public class ArrayInitializerDemo {
	public static void main(String[] args) {
		int[] list = { 1, 4, 9, 16, 25, 36, 49 };
		list[5] = 99;
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
