public abstract class Shape {
    protected String color;
    public void setColor(String newColor) {
        color = newColor;
    }
    public String getColor() {
        return color;
    }
    public abstract void redraw();
}
