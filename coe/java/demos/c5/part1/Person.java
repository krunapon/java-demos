package coe.java.demos.c5.part1;
class ThaiPerson extends Person {
	public ThaiPerson(String name) {
		super(name);
	}
	public void greeting() {
		System.out.println("Sawasdee " + name);
	}
}
class EnglishPerson extends Person {
	public EnglishPerson(String name) {
		super(name);
	}

	public void greeting() {
		System.out.println("Hello" + name);
	}
}
public abstract class Person  {
	// instance variable
	protected String name;
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	// instance method
	abstract public void greeting();

	public void setName(String n) {
		name = n;
	}
	String getName() {
		return name;
	}

	public static void main(String[] args) {
		final int NUM_PERSON = 3;
		Person[] persons = new Person[NUM_PERSON];
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
