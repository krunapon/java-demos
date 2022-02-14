public class TestKKUStudent {
   public static void main(String[] args) {
	    KKUStudent manee = new KKUStudent();
        manee.setName("Manee");
        manee.setGPA(3.2);
	    System.out.println(manee); // Student's name is <Manee> and has GPA as <3.2>
	    KKUStudent mana = new KKUStudent("Mana");
        System.out.println("num students is " + KKUStudent.getNumStudents());
        System.out.println("Manee's name is " +  manee.getName() + " GPA is " + manee.getGPA());
        System.out.println("Manee's university is " + manee.getUniName());
   }
}
