public class ContinueExample {
    public static void main(String[] args) {
        int sum = 0;
        int item = 0;
        while (item < 5) {
            item++;
            if ((item % 2) == 0)
                continue;
            sum += item;
            System.out.println("sum is " + sum + " item is " + item);
        }
        System.out.println("sum is " + sum);
    }
}

