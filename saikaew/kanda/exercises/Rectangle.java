package saikaew.kanda.exercises;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public void doubleWidthHeight() {
        width = width * 2;
        height = height * 2;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 8.0);
        System.out.println("Rectangle width = " + rect.width + ", height = " + rect.height);
        rect.doubleWidthHeight();
        System.out.println("After calling method doubleWidthHeight()");
        System.out.println("Width = " + rect.width + ", Height = " + rect.height);
    }
}
