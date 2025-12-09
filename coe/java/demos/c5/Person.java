import java.util.*;
abstract class Person {
    String name;
    abstract public void speak();
    static final int NUM_PERSON = 3;
   /* public void speak() {

    } */
    public static void main(String[] args) {
        Person[] people = new Person[NUM_PERSON];
        people[0] = new ThaiPerson("Manee");
        people[1] = new ChinesePerson("Huilin");
        people[2] = new EnglishPerson("George");
        for (int i = 0; i < NUM_PERSON; i++) {
            people[i].speak(); 
        }
    }
}
// inherits Person
class ThaiPerson extends Person {
    public ThaiPerson(String name) {
       this.name = name; 
    }
    public void speak() {
        System.out.println("สวัสดี");
   }
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

}
// inherits Person
class ChinesePerson extends Person {
    public ChinesePerson(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("Nee How");
   }

}

class EnglishPerson extends Person {
    public EnglishPerson(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("Hello");
    }
      
}

class JapanesePerson extends Person {
    public void speak() {
        System.out.println("Konnichiwa");
    }
}