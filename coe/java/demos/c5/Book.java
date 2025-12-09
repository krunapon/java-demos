package coe.java.demos.c5;

//class declared as public
public class Book {
	// non-static variable
	// instance variable
	private String title;
	// static variable
	// class variable
	static String publisher;
	public Book(String t) {
		title = t;
	}
	Book() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		title = t;
	}
}
