package coe.java.demos.c7.collection;
import java.util.*;
public class StudentsCourses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> courses =
			new HashSet<String>();
		Set<String> courses2 =
			new HashSet<String>();
		Map<String, Set<String>> students =
			new HashMap<String, Set<String>>();
		courses.add("Java");
		courses.add("Discretes Maths");
		Iterator<String> it = courses.iterator();
		System.out.print("{");
		while (it.hasNext()) {
			String course = it.next();
			System.out.print(course + ",");
		}
		System.out.println("}");
		students.put("Manee", courses);
		courses2 = students.get("Manee");
		Iterator<String> it2 = courses2.iterator();
		System.out.print("{");
		while (it2.hasNext()) {
			String course = it2.next();
			System.out.print(course + ",");
		}
		System.out.println("}");
	}

}
