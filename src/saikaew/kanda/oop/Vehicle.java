class Car extends Vehicle {
    private int numberOfDoors;
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int newNumDoors) {
        numberOfDoors = newNumDoors;
    }
    public String toString() {
        return " velocity = " + velocity +
                " number of doors = " + numberOfDoors;
    }
}
public class Vehicle {
    protected float velocity;
    public float getVelocity() {
        return velocity;
    }
    public void setVelocity(float newVelocity) {
        velocity = newVelocity;
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setVelocity(80);
        myCar.setNumberOfDoors(4);
        System.out.println("Velocity = " +
                myCar.getVelocity() + " Number of doors = "
                + myCar.getNumberOfDoors());

        Vehicle myVehicle = myCar; // 1
        Vehicle myVehicle2 = new Car(); // 2
       // Car myCar2 = myVehicle; // 3
       // Car myCar3 = new Vehicle(); // 4
        Car myCar4 = (Car) myVehicle;  // 5
        if (myVehicle instanceof Car) {
            System.out.println("myCar is an instance of Car");
        } else {
            System.out.println("myCar is not an instance of Car");
        }

    }
}

class MotorCycle {
    public MotorCycle() {
        Vehicle v = new Vehicle();
        v.velocity = 80;
    }
}
// Car inherits class Vehicle so all methods and variables
// of class Vehicle are also belong to class Car




