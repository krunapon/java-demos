class Temp {
    Temp() {
        this(5);
        System.out.println("The Default constructor");
    }
    Temp(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
    Temp(int x, int y) {
        System.out.println(x * y);
    }
    public static void main(String args[]) {
        new Temp();
    }
}
