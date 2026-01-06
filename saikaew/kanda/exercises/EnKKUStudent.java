package saikaew.kanda.exercises;

public class EnKKUStudent extends KKUStudent {
    protected int gearNumber;

    public EnKKUStudent(String n) {
        name = n;
    }

    public void setGearNumber(int gNumber) {
        gearNumber = gNumber; 
    }

    public String toString() {
        return name + " is a KKU Engineering student with gear number as " +
                gearNumber;
    }

}