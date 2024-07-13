package week10;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StudentScores1 {

	  public static void main(String[] args) {
		  
		    try {
		    	
		    	// Create a File object
		    	// The file to read from is Student Assignment Scores.csv
		    	File fileObject = new File("Student Assignment Scores.csv");
		      
		    	// Create a Scanner object to scan the file or to obtain the string content on the file
		    	Scanner scannerObject = new Scanner(fileObject);
		      
		    	// Output the String text on the file, Student Assignment Scores.csv
		    	while (scannerObject.hasNextLine()) { // Check each line of the file if there is a string
		    		
		        String data = scannerObject.nextLine();
		        
		        System.out.println(data);
		        
		    	}
		    	
		    	// close scannerObject
		    	scannerObject.close();
		      
		    } catch (FileNotFoundException e) {
		    	
		      System.out.println("An error occurred.");
		      
		      e.printStackTrace();
		      
		    }
		  }
}
