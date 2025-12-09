package coe.java.demos.c5;

interface ITPerson {
	 public void programming();
	 public void readITNews();
}

interface YoungGen {
	public void watchMovies();
}

class ComEnStudent implements YoungGen, ITPerson {
	private String name;
	public ComEnStudent() {
		
	}
	public ComEnStudent(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	// instance method (non-static method)
	public void programming() {
		System.out.println("Programming in Java");
	}
	public void watchMovies() {
		System.out.println("Downloading from YouTube");
	}
	public void readITNews() {
		System.out.println("Reading from Mashable News");
	}
	public String toString() {
		return name;
	}
	
}
public class COEStudent2 {
		public static void main(String[] args) {
		// s is a variable that is an object in class COEStudent
			ComEnStudent s = new ComEnStudent();
			ComEnStudent s2 = 
					new ComEnStudent("Manee");
			s.setName("Mana");
			System.out.println(s); // Mana
			System.out.println(s2); // Manee
		}
}
