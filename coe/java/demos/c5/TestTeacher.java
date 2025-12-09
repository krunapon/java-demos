class Teacher {
    private String name;
    Teacher() {
        
    }
    Teacher(String newName) {
        name = newName;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
}

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Mana");
        t1.setName("Manee");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}