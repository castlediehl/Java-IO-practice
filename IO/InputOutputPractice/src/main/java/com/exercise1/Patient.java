package com.exercise1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.util.stream.Stream;

/**
 * 
 * @author castle_diehl
 * Patient class implements the java Serializable interface
 *
 */

public class Patient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3071961050855431704L;
	// Patient Info
	String name;
	int age;
	String hairColor;
	transient int SSN;
	
	// Constructor
	public Patient(String name, int age, String hairColor, int SSN) {
		this.name=name;
		this.age=age;
		this.hairColor=hairColor;
		this.SSN = SSN;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", haircolor=" + hairColor + ", Social= " + SSN + "]";
	}
	
	
	
	
}
