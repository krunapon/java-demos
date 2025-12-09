package coe.java.demos.c3;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String course = "EN811305";
        final String acp = "EN811302";
        switch (course) {
            case "EN811300":
                System.out.println("Discrete Maths");
                break;
            case "EN811301":
            case acp:
                System.out.println("Advanced Compro");
            default:
                System.out.println("Have fun in learning");
        }

        int result = 85;
        int score = 85;
        final int bScore = 70;
        switch (result) {
            case 85:
                System.out.println("You got A");
                break;
            case bScore:
            case 78:
                System.out.println("You got B");
                break;
        }
    }
}
