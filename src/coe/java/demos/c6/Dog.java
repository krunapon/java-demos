package coe.java.demos.c6;
import java.awt.event.*;
// Class Dog is a subclass of class Animal
// Class Dog implements interface ActionListener
public class Dog extends Animal
	implements ActionListener {
	public Dog(String name) {
		// reuse the constructor of Animal
		super(name); 
	}
	// method of interface ActionListener
	public void actionPerformed(ActionEvent e) {
	}
}
