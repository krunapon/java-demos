package coe.java.demos.c5;
class Pen {
    String color = "Blue";
    // constructor
    public Pen(String newColor) {
        color = newColor;
    }
    public Pen() {
        color = "Blue";
    }
    public void printColor() {
        System.out.println("Pen's color is " + color);
    }
    @Override
    public String toString() {
        return "Pen's color is " + color;
    }
}
public class TestPen {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen("Red");
        System.out.println(pen1);
        pen2.printColor();
    }
}