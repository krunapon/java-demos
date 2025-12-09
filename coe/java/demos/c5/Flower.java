package coe.java.demos.c5;

abstract class Flower {
	protected String smell;
	abstract void plant();
	public String getSmell() {
		return smell;
	}
	public void setSmell(String smell) {
		this.smell = smell;
	}
}

class Rose extends Flower {
	Rose() {
		this.smell = "good";
	}
	public void plant() {
		System.out.println("Preparing for soil");
	}
}

class FrenchRose extends Rose {
	FrenchRose() {
		this.smell = " very " + super.smell;
	}
	public void plant() {
		super.plant();
		System.out.println("Watering soil");
	}
}
