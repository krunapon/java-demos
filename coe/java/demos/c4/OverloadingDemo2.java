public class OverloadingDemo2 {
    public static void main(String[] args) {
        display("Hello");
        display("Hello", "Bye");
        display(2, 3);
        display(2, 3, 4);
    }

    static void display(String msg) {
        System.out.println(msg);
    }

    static void display(String msg1, String msg2) {
        System.out.println(msg1 + " and " + msg2);
    }

    static void display(int n1, int n2) {
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }

    static void display(int n1, int n2, int n3) {
        System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + (n1 + n2 + n3));
    }
}