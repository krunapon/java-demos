public class TestStudents2 {
    public static int learnFaster(Trainable s1, Trainable s2) {
        if (s1.learnSpeed() < s2.learnSpeed()) {
            return 1;
        } else if (s1.learnSpeed() > s2.learnSpeed()) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Trainable[] students = new Trainable[2];
        students[0] = new AbcStudent("Manee");
        students[1] = new VietnameseStudent("Yue");
        if (learnFaster(students[0], students[1]) < 0) {
            System.out.print(students[0] + " learns faster");
        } else if (learnFaster(students[0], students[1]) > 0) {
            System.out.print(students[1] + " learns faster");
        } else {
            System.out.print(students[1] + " learns with equal pace");
        }
    }
}
