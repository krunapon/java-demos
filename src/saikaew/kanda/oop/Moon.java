class SolarSystem { }
class Earth extends SolarSystem { }
class Mars extends SolarSystem { }
public class Moon extends Earth {
    public static void main(String args[]) {
        Earth earth = new Earth();
        Mars mars = new Mars();
        Moon moon = new Moon();
        System.out.println(earth instanceof SolarSystem);
        System.out.println(mars instanceof SolarSystem);
        System.out.println(moon instanceof SolarSystem);
        SolarSystem[] solars = new SolarSystem[3];
        solars[0] = earth;
        solars[1] = mars;
        solars[2] = moon;
        for (SolarSystem ss : solars) {
            System.out.println(ss instanceof SolarSystem);
        }
    }
}
