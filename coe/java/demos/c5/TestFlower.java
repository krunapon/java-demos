package coe.java.demos.c5;

public class TestFlower {
	public static void main(String[] args) {
		FrenchRose fr = new FrenchRose();
		System.out.println("A french rose smell is ");
		fr.getSmell();
		System.out.println("To plan it, you need to");
		fr.plant();
	}
}
