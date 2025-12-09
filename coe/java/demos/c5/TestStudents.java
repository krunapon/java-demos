package coe.java.demos.c5;
abstract class Student23 {
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    abstract void writePrograms();
}
class ComEnStudent extends Student23 {
    public ComEnStudent(String name) {
        this.name = name;
    }
    public void writePrograms() {
        System.out.println(name + " writes programs in Python and Java");
    }
}

class DmeEnStudent extends Student23 {
    public DmeEnStudent(String name) {
        this.name = name;
    }
    public void writePrograms() {
        System.out.println(name + " writes programs in Python and C#");
    }
}

interface Musician {
    public void playInstrument(String instrument);
    public void hasFavoriteBand(String band);
}

interface SportsPerson {
    public void playSports(String sport);
}
class FreshmenComEnStudent extends ComEnStudent implements Musician, SportsPerson {
    public FreshmenComEnStudent(String name) {
        super(name);
    }
    public void writePrograms() {
        super.writePrograms();
        System.out.println(name + " finds that writing Java programs is more complicated than Python programs");
    }
    public void playInstrument(String instrument) {
        System.out.println(name + " plays " + instrument);
    }
    public void hasFavoriteBand(String band) {
        System.out.println(name + " is a Fanclub of " + band);
    }
    public void playSports(String sport) {
        System.out.println(name + " plays " + sport);
    }

}
public class TestStudents {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        Student23[] students = new Student23[NUM_STUDENTS];
        students[0] = new DmeEnStudent("Manee");
        students[1] = new ComEnStudent("Mana");
        students[2] = new ComEnStudent("Piti");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            students[i].writePrograms();
        }
       /* FreshmenComEnStudent chujai = new FreshmenComEnStudent("Chujai");
        chujai.playInstrument("Piano");
        chujai.playSports("Volleyball");
        chujai.hasFavoriteBand("Bodyslam");
        chujai.writePrograms(); */
    }
}
