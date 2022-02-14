package coe.java.demos.c2;

public class VariableDeclaration {
    // function add 
    public static void add() {
        int a = 2; // local variable, known only side this function
        int b = 3;
        int result = a + b;
        System.out.println("The result is " + result);
    } 

    public static void main(String[] args) {
        add();
    }
}
