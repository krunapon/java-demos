package coe.java.demos.c5;

class YoungPerson {
	
}

class ThaiStudent {
	
}

interface Study {
	public void read();
	public void listen();
	public void write();
}

interface HaveFun {
	public void takeTrip();
	public void eat();
}
public class KKUStudent2 
	extends  YoungPerson 
		implements Study, HaveFun {
	public void read() {
		
	}
	public void listen() {
		
	}
	public void write() {
		
	}
	// method definition
	public void takeTrip() {}
	// method declaration
	public void eat() {}
}
