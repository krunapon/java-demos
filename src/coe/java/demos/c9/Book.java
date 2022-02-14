package coe.java.demos.c9;
import java.io.*;
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3722985238703521524L;
	private String id;
	private Double price;
	public Book(String id, Double price) {
		this.id = id;
		this.price = price;
	}
	public String getID() {
		return id;
	}
	public Double getPrice() {
		return price;
	}
}
