package coe.java.demos.c5;


public class TestBook {
	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("Com pro");
		Book b2 = 
			new Book("Advanced Com pro");
		Book.publisher = "Se-ed";
		Book.publisher = "Nai-in";
		System.out.println(Book.publisher);
		System.out.println(b.getTitle());
		System.out.println(b2.getTitle());
	}

}
