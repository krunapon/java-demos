package coe.java.demos.c5.part1;

public class EnKKUStudent extends KKUStudent {
    protected int gearNumber;

    public EnKKUStudent(String name) {
        super(name);
    }
    public int getGearNumber() {
        return gearNumber;
    }
    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }
    public String toString() {
        return name + " is a KKU Engineering student with gear number as " +
                gearNumber;
    }
}
