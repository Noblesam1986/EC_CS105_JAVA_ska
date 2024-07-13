package week10;

import java.util.Scanner;
import java.io.File;

public class StudentScores2 {
	
	public static void main(String[] args) {
	
		// The Scanner object, scanObjec is going to take a new file
		Scanner scanObjec = null;
		
	    try { // Checking if the file exist
	    	
	    	
	    	// Create a File object
	    	// File fileObjec = new File("Student Assignment Scores.csv");
		      
	    	// Create a Scanner object to scan the file or to obtain the string content on the file
	    	// Scanner scanObjec = new Scanner(fileObjec);
	    	
	    	
	    	// Creating a Scanner object with the File object
	    	// This will also check if the file exist
	    	scanObjec = new Scanner(new File("Student Assignment Scores.csv")); 
	    	
	    	
	    	// Printing the header of the columns names
	    	// The First Row of the List which contains the column headings
	    	scanObjec.nextLine();
	    	
	    	// Output the header
	    	// %n - new line
	    	System.out.printf("%n%-30s%7s%7s%7s%7s%7s%7s%n", "Student", "Asn 1", "Asn 2", "Asn 3", "Asn 4", "Asn 5", "Asn 6");
	    	
	    	// Output the underline below the header
	    	System.out.println("------------------------------------------------------------------------");
	    	
	    	// Output the string content on the file, Student Assignment Scores.csv 
	    	// Using while loop
	    	while(scanObjec.hasNextLine()) { // Checking if each line of the file in the scanner object has text 
	    		
	    		// Saving each line of text as an Array String
	    		// Separating the words in each line's text or String Array using comma "," 
	    		// NOTE: On the file, Student Assignment Scores.csv, the text in each line is separated by a comma
	    		String[] studentAssignments = scanObjec.nextLine().split(",");
	    		
	    		// Output the text on the file, Student Assignment Scores.csv
	    		// System.out.println(scanObjec.nextLine());
	    		
	    		System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", studentAssignments[0], studentAssignments[1], studentAssignments[2], studentAssignments[3], studentAssignments[4], studentAssignments[5], studentAssignments[6]);
	    	
	    		
	    	}
	    
	    	
	    	
	    } catch (Exception e) { // Catching errors
	    	
	    	e.printStackTrace();
	      
	    } finally{
	    	
	    	if(scanObjec != null) { // When the scanner object, scanObjec is not null
	    		
	    		// Close the scanner object, scanObjec
	    		scanObjec.close();
	    	}
	    }
	    
	    
	    
	  }

}
