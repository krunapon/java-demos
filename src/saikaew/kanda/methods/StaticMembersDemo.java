public class StaticMembersDemo {
    static String COURSE_ID = "EN811302"; // static member
    public static void main(String[] args) {
        COURSE_ID = "EN811301";
        System.out.println("This course is " + COURSE_ID);
    }
}
