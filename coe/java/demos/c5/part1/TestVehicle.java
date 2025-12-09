package coe.java.demos.c5.part1;
public class TestVehicle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.setVelocity(80);
		myCar.setNumOfDoors(4);
		System.out.println("Velocity = " + myCar.getVelocity() + 
				"  number of doors = " + myCar.getNumOfDoors());
		Vehicle myVehicle = myCar;
		Vehicle myVehicle2 = new Car();
		//Car myCar2 = myVehicle;
		//Car myCar3 = new Vehicle();
		Car myCar4 = (Car) myVehicle;
		Motorcycle m = new Motorcycle();
		Vehicle myVehicle3 = m;
		if (myVehicle2 instanceof Car) {
			System.out.println("myVehicle2 is an instance of Car");
		} 
		if (myVehicle3 instanceof Motorcycle) {
			System.out.println("myVehicle3 is an instance of Motorcycle");
		} 
		// Motorcycle m1 = (Motorcycle) myCar;
		if (myVehicle2 instanceof Motorcycle) {
			Motorcycle m2 = (Motorcycle) myVehicle2;
		} else {
			System.out.println("myVehicle2 is not an instance of Motorcycle");
		}
 	}
}
