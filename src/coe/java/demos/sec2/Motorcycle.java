package coe.java.demos.sec2;

// that is a subclass of Vehicle
// has boolean variable hasBasket
// has double variable velocity
public class Motorcycle extends Vehicle {
	private boolean basket;
	public void setBasket(boolean value) {
		basket = value;
	}
	public boolean hasBasket() {
		return basket;
	}
}
