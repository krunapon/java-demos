package coe.java.demos.sec2;

public class TestVehicle {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setVelocity(80);
		myCar.setNumOfDoors(4);
		System.out.println("velocity " +
				myCar.getVelocity() +
				" num doors " +
				myCar.getNumOfDoors());
		Vehicle myVehicle = myCar;
		Vehicle myVehicle2 = new Car();
		// myVehicle is a car
		//Car myCar3 = myVehicle;
		// new object of Vehicle is a car
		//Car myCar4 = new Vehicle();
		// type casting.  myVehicle is actually a car
		Car myCar5 = (Car) myVehicle;
		Motorcycle m = new Motorcycle();
		m.setBasket(true);
		m.setVelocity(70);
		System.out.println(m.hasBasket()
				+ " " +
				+ m.getVelocity());
		Vehicle myVehicle3 = m;
		if (myVehicle instanceof Car) {
			System.out.println("myVehicle is an instance of Car");
		} 
		if (myVehicle3 instanceof Motorcycle) {
			System.out.println("myVehicle3 is an instance" +
					"of Motorcycle ");
		}
		Motorcycle m2 = (Motorcycle) myVehicle;
	
	}

}
