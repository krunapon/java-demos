import java.lang.*;
class A {
    public void print() {
        System.out.println("Bangkok");
    }
}
class B extends A {
    public void print2() {
        System.out.println("University");
    }
}
class C extends B {
    public void print()
    {
        System.out.println("Khon Kaen");
    }
}
public class TestInheritance2 {
    public static void main(String[] args)
    {
        C c = new C();
        c.print();
        c.print2();
        c.print();
    }
}

