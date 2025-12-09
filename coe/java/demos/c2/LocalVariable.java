public class LocalVariable {
    static int a = 2; // static variable
    int b = 3; // non-static variable or instance variable

    public static void method() {
        // cannot declare static variable in method
        static int d = 5;
        int c = 5; // can declare a local variable
        a = 4; // update static variable
        System.out.println(a + " " + c);
    }

    public static void main(String[] args) {
        method();
        System.out.println(a);
        // variable c is unknown in main method
        System.out.println(c);
    }
}
