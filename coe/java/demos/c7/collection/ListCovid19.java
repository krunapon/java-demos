import java.util.*;

public class ListCovid19 {
    public static void main(String[] args) {
        List<Integer> numDeaths = new LinkedList<Integer>();
        numDeaths.add(14);
        numDeaths.add(1);
        numDeaths.add(0);
        numDeaths.add(1);
        numDeaths.add(2);
        for (ListIterator<Integer> lst
        =   numDeaths.listIterator(numDeaths.size());
        lst.hasPrevious();) {
            System.out.print(lst.previous() + " ");
        }
        System.out.println();
        for (Integer n : numDeaths) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int i = 0; i < numDeaths.size(); i++) {
            System.out.print(numDeaths.get(i) + " ");
        }
    }
}