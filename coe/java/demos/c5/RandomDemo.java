package coe.java.demos.c5;
import java.util.Random;
public class RandomDemo {
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.print((rand.nextInt(6)+1) + " ");
		}

	}
}
