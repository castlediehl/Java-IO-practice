package com.exercise1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * 
 * @author castle_diehl
 * Patient class implements the java Serializable interface
 * Method getInfo() prints patient's info to the console
 */

public class Patient implements Serializable {

	// Patient Info
	String name;
	int age;
	static transient String hairColor;
	
	// Constructor
	public Patient(String name, int age, String hairColor) {
		this.name=name;
		this.age=age;
		this.hairColor=hairColor;
	}
	
	// getInfo method
	public void getInfo() throws IOException {
		
		// Data Input Stream
		DataInputStream dis = new DataInputStream(System.in);
		
		// Get user input
		System.out.println("Enter patient's name: ");
		String name = dis.readLine();
		System.out.println("Enter patient's age: ");
		int age = Integer.parseInt(dis.readLine());
		System.out.println("Enter patient's haircolor: ");
		String hairColor = dis.readLine();
		
		// Print output
		System.out.format("Your patient's name is %s, age %d, and haircolor is %s", name, age, hairColor);
	}
}
