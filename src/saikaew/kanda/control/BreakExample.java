public class BreakExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int sum = 0;
        int item = 0;
        while (item < 5) {
            System.out.println("Current sum is " + sum);
            item++;
            sum += item;
            if (item >= 6)
                break;
        }
        System.out.println("Sum is " + sum);
    }

}

