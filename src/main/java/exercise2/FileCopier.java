package exercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author castle_diehl
 * 
 */

public class FileCopier {

	public static void main(String args[]) throws IOException {
		//Read file with BufferedReader
		BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\castle_diehl\\OneDrive - HCL Technologies Ltd\\Documents\\sandbox\\IO\\InputOutputPractice\\test1.txt"));
		
		// iterator i
		String i;
		
		// print text line by line from file
		while((i = fr.readLine()) != null) {
			System.out.println(i);
		}
		
		// close filereader
		fr.close();
	}
}
