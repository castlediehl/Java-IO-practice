package com.exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * 
 * @author castle_diehl
 * TestPatient declares Patient object and calls method to show
 * patient's info
 */

public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		// Get user input
		try {			
				System.out.println("Enter patient's name: ");
				String name;
				name = br.readLine();
				System.out.println("Enter patient's age: ");
				int age = Integer.parseInt(br.readLine());
				System.out.println("Enter patient's haircolor: ");
				String hairColor = br.readLine();
				System.out.println("Enter patient's social security number: ");
				int SSN = Integer.parseInt(br.readLine());
			
			// New Patient
			Patient p1 = new Patient(name, age, hairColor, SSN);
			
			FileOutputStream patientsFiles = new FileOutputStream("listOfPatients.txt");
			ObjectOutputStream objectPatient = new ObjectOutputStream(patientsFiles);
			objectPatient.writeObject(p1);
			patientsFiles.close();
			objectPatient.close();
			br.close();
			
			} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
