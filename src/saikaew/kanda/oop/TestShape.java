public class TestShape {
    public static void main(String[] args) {
        //'Shape' is abstract; cannot be instantiated
        // Shape is an abstract class
        // An abstract class cannot be used to create an object
      //  Shape shape = new Triangle2();
      //  Shape shape2 = new Circle2();
        Shape[] shapes = new Shape[2];
        shapes[0] = new Triangle2();
        shapes[1] = new Circle2();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].redraw(); // polymorphism
        }

    }
}
