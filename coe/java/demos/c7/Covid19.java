import java.util.*;

public class Covid19 {
    public static void main(String[] args) {
        HashMap<String,Integer> deaths =
            new HashMap<String,Integer>();
        String country;
        Scanner scanner = new Scanner(System.in);
        Integer numDeaths;
        deaths.put("China", 2945);
        deaths.put("S. Korea", 28);
        deaths.put("Italy", 52);
        deaths.put("Iran", 66);
        deaths.put("Diamond Princess", 7);
        System.out.println(deaths.toString());
        System.out.print("Enter country:");
        country = scanner.next();
        
        if ((numDeaths = deaths.get(country)) != null) {
            System.out.println("Number of deaths in " +
            country + " is " + numDeaths);
        } else {
            System.out.println(country + " is not in top 5");
        }
    }
}