package coe.java.demos.c5.part1;
class ThaiPerson extends Person2 {
	public ThaiPerson(String name) {
		super(name);
	}

	@Override
	public void geeting() {
		System.out.println("Sawasdee " + name);
	}
}
class EnglishPerson extends Person2 {
	public EnglishPerson(String name) {
		super(name);
	}

	public void greeting() {
		System.out.println("Hello" + name);
	}
}
public class Person2  {
	// instance variable
	protected String name;
	public Person2() {
		
	}
	public Person2(String name) {
		this.name = name;
	}
	// instance method
	public void greeting() {
		System.out.println("Hi " + name);
	}

	public void setName(String n) {
		name = n;
	}
	String getName() {
		return name;
	}

	public static void main(String[] args) {
		final int NUM_PERSON = 3;
		Person2[] persons = new Person2[NUM_PERSON];
		persons[0] = new ThaiPerson("Manee");
		persons[1] = new EnglishPerson("John");
		persons[2] = new ThaiPerson("Mana");
		for (int i = 0; i < NUM_PERSON; i++) {
			/*if (persons[i] instanceof ThaiPerson) {
				((ThaiPerson) persons[i]).greetingThai();
			} else if (persons[i] instanceof EnglishPerson) {
				((EnglishPerson) persons[i]).greetingEnglish();
			}*/
			persons[i].greeting();
		}
	}
}
