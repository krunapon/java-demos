public class RecursiveDemo {
    static int a(int n) {
        if (n == 1) 
            return 3;
        else
            return a(n - 1) + 2;
    }
    public static void main(String[] args) {
        System.out.println("a(10) = " + 
            a(10));
    }
}