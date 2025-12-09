package coe.java.demos.c5;

class Kid {
	String name;

	Kid() {
		name = "a kid";
	}

	public void play() {
		System.out.println(name + " likes to play with toys");
	}
}

class SmallKid extends Kid {
	String name;

	SmallKid() {
		name = "a small kid";
	}

	SmallKid(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + " " + super.name;
	}

	@Override
	public void play() {
		// call the method play() of its superclass
		// call method play() of class Kid
		super.play();
		System.out.println(name +
				" likes to play with parents the most");
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		SmallKid sk = new SmallKid();
		System.out.println(sk);
		sk.play();
	}
}
