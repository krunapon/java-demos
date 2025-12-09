package coe.java.demos.c7;
import java.util.*;
public class CollectionsDemo {
	public static void display(String msg, LinkedList<String> list) {
		System.out.print(msg);
		for (String company: list) {
			System.out.print(company+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Google");
		list.add("Yahoo");
		list.add("Microsoft");
		list.add("Apple");
		Collections.sort(list);
		display("After sorting:", list);
		Collections.shuffle(list);
		display("After shuffling:", list);
		Collections.reverse(list);
		display("After reversing:", list);
		Collections.sort(list);
		System.out.println(list.toString());
		int index = Collections.binarySearch(list, "Google");
		System.out.println("Google is found at index " + index);
		index = Collections.binarySearch(list, "Facebook");
		System.out.println("Facebook is found at index " + index);
		list.remove("Yahoo");
		System.out.println(list.toString());
	}
}
