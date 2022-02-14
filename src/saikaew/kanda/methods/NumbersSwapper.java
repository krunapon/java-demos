public class NumbersSwapper {

    static void swap(int m, int n) {
        // m address memory 3000
        System.out.println("Inside swap method");
        System.out.println("Before swapping m is " + m + " n is " + n);
        // Swapping m with n
        int temp = m;
        m = n;
        n = temp;
        System.out.println("After swapping m is " +
                m + " n is " + n);
    }

    public static void main(String[] args) {
        int m = 2; // address memory 2000
        int n = 3;
        System.out.println("Before invoking the swap method: m is " + m + " n is " + n);
        swap(m,n);
        System.out.println("After invoking the swap method: m is  " + m + " n is " + n);
    }
}
