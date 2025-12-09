package coe.java.demos.c3;

public class NestedForLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i = i + 4) {
            for (int j = 1; j <= 4; j++) {
                System.out.print((i + j) + " ");
            }
            System.out.println();
        }
    }
}