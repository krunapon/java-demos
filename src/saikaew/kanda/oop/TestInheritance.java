import java.lang.*;
interface One {
    public void print();
}
interface Two {
    public void print2();
}
interface Three extends One, Two {
    public void print();
}
class Child implements Three {
    @Override
    public void print() {
        System.out.println("Khon Kaen");
    }

    public void print2() {
        System.out.println("University");
    }
}
public class TestInheritance {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.print();
        c.print2();
        c.print();
    }
}