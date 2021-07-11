package com.exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePatientsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient p1 = null;

		try {
			FileInputStream patientsDeserialized = new FileInputStream("./test1.txt");
			ObjectInputStream patientsObject = new ObjectInputStream(patientsDeserialized);

			p1 = (Patient) patientsObject.readObject();
			patientsDeserialized.close();
			patientsObject.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(p1);
	}

}
