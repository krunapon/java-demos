public class ThisDemo {
    private String name;
    public ThisDemo(String name) {
        this.name = name;
    }
    public void methodA() {
        System.out.println("method A");
    }
    public String toString() {
        return "name:" + name;
    }
    public void methodB() {
        this.methodA();  // methodA();
        System.out.println("method B");
        System.out.println(this);
    }
    public static void main(String[] args) {
        ThisDemo td = new ThisDemo("kku");
        td.methodB();
    }
}

