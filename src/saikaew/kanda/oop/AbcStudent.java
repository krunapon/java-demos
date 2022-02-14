public class AbcStudent extends Student implements Trainable {
    public AbcStudent(String name) {
        this.name = name;
    }
    public int learnSpeed() {
        return 4;
    }
    public void writePrograms() {
        System.out.println("write writePrograms for 2 hours");
    }
    public String toString() {
        return name + ": an AbcStudent";
    }
}
