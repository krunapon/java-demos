public class VietnameseStudent extends Student
        implements Trainable {
    public VietnameseStudent(String name) {
        this.name = name;
    }
    public int learnSpeed() {
        return 8;
    }
    public void writePrograms() {
        System.out.println(name + "write writePrograms for 8 hours");
    }
    public String toString() {
        return name + ": a VietnameseStudent";
    }
}
