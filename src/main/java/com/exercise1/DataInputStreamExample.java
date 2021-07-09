package com.exercise1;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter name: ");
		String name = dis.readLine();
		System.out.println("Enter age: ");
		int age = Integer.parseInt(dis.readLine());
		System.out.println("Your name is " + name + ", and you are " + age + " years old");
		
		
	}

}
