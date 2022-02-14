public class StaticMethodDemo {
    // static method
    static void hello() {
        System.out.println("Hello");
    }
    //non-static method
    static void bye() {
        System.out.println("Bye");
    }
    static void method2() {
        System.out.println("It's cold today!");
    }
    void method1() {
        method2();
    }
    // static method
    public static void main(String[] args) {
        hello();
        // static method cannot call
        // non-static method
        bye();
    }
}

