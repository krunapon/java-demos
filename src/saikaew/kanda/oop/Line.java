interface Drawable {
    public abstract void draw();
    public void draw2();
}

interface Fillable {
    public void fill();
}


public class Line extends Shape implements Drawable, Fillable {
    public void draw() {
        System.out.println("Drawing a line");
    }
    public void draw2() {

    }
    public void redraw() {

    }
    public void fill() {
        System.out.println("Filling a line");
    }
    public static void main(String[] args) {
        Line l = new Line();
        l.draw();
        l.fill();
    }
}
