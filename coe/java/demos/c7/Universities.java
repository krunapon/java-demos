import java.util.*;

class Universities {

    public static void display(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        String[] universities = {"KKU", "KU", "PSU", "CMU", "CU"};
        display(universities);
        System.out.println(Arrays.toString(universities));
        Arrays.sort(universities);
        System.out.println("After sorting");
        display(universities);
        String searchU = "KKU";
        int index = Arrays.binarySearch(universities, searchU);
        System.out.println(searchU + " is found at " + index);
    }
}