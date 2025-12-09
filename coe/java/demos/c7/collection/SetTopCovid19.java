import java.util.*;

public class SetTopCovid19 {
    public static void main(String[] args) {
        Set<String> top5 = 
            new HashSet<String>();
        top5.add("China");
        top5.add("S. Korea");
        top5.add("Italy");
        top5.add("Iran");
        top5.add("Germany");
        System.out.println("There are " + 
        top5.size() + " countries as follows: " +
        top5);
    }
}