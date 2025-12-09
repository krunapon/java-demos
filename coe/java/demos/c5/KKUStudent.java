class EnKKUStudent extends KKUStudent {
    public void register() {
        super.register();
        System.out.println("Register Drawing");
    }
}

class MdKKUStudent extends KKUStudent {
    public void register() {
        super.register();
        System.out.println("Register Anatomy");
    }
}
public class KKUStudent {
    public static String name = "Khon Kaen University";
    public void register() {
        System.out.println("Register General Ed Courses");
    }
    
    public static void main(String[] args) {
        KKUStudent enStudent1 = new EnKKUStudent();
        KKUStudent mdStudent1 = new MdKKUStudent();
        System.out.println(KKUStudent.name); // Khon Kaen University
        /* output:
        Register General Ed Courses
        Register Drawing 
        */
        enStudent1.register(); 
        /* output:
        Register General Ed Courses
        Register Anatomy 
        */
        mdStudent1.register();

    }
}