package coe.java.demos.c7.collection;
import java.util.*;
public class StudentsList1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> students =
			new HashMap<String, String>();
		students.put("5340201234", "Manee");
		students.put("5340208907", "Mana");
		System.out.println(students.get("5340201234"));
	}

}
