public class TestEnKKUStudent {
    public static void main(String[] args) {
      //  EnKKUStudent manee = new EnKKUStudent("Manee");
       // EnKKUStudent mana = new EnKKUStudent();
        EnKKUStudent[] students = new EnKKUStudent[2];
        students[0] = new COEStudent();
        students[1] = new DMEStudent();
        for (int i = 0; i < students.length; i++) {
            students[i].register();
        }
    }
}
