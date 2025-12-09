class Rec2 extends Object {
    private double width;
    private double height;
    public Rec2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rec2() {
        
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String toString() {
        return "width = " + width + " height = " + height;
    }
    public static void main(String[] args) {
        Rec2 rec = new Rec2(2, 3);
        Rec2 rec2 = new Rec2();
        System.out.println(rec);
        
    }
}