package week10;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class StudentScores3 {
	
	public static void main(String[] args) {
		
		// Creating an ArrayList
		// Will be used as a multidimensional ArrayList
		ArrayList<String[]> studentAssignmentsScore = loadDataFromFile("Student Assignment Scores.csv");
		
		
		// Output a new report which contains Total Pay
		// printStudentReport(studentAssignmentsScore);
		printStudentZeroReport(studentAssignmentsScore);
	  }
	
	
	
	// Create a method to print the whole students report
	public static void printStudentReport(ArrayList<String[]> studentAssignmentsScore) {
		
		// Output the header
    	// %n - new line
    	System.out.printf("%n%-30s%7s%7s%7s%7s%7s%7s%n", "Student", "Asn 1", "Asn 2", "Asn 3", "Asn 4", "Asn 5", "Asn 6");
    	
    	// Output the underline below the header
    	
    	System.out.println("------------------------------------------------------------------------");
    	
    	for(String[] studentAssignments : studentAssignmentsScore) { // This will assign each element (or Array String) in the ArrayList, studentAssignmentsScore to the string variable studentAssignments for each iteration
    		
    		// Output each formated text on each line on the file, Student Assignment Scores.csv
    		System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", studentAssignments[0], studentAssignments[1], studentAssignments[2], studentAssignments[3], studentAssignments[4], studentAssignments[5], studentAssignments[6]);
    	
    	}
		
	}
	
	
	// Printing the zeros
	public static void printStudentZeroReport(ArrayList<String[]> studentAssignmentsScore) {
		
		// Output the header
		System.out.printf("%n%-30s Assignment with 0%n", "Student");
		
		System.out.printf("--------------------------------------------------\n");
		
		// Loop through the elements of ArrrayList
		for(String[] student : studentAssignmentsScore) { // For each String Array in the studentAssignmentsScore ArrayList
			
			// Loop within a String element of ArrayList
			for(int i = 1; i < student.length; i++) { // For each element in each String Array
				
				//
				if(student[i].equals("0")) {
					
					System.out.printf("%-30s%7s%n", student[0], i);
					
				}
				
			}
			
		}
		
	}
	
	
	
	// Creating a method which copies the text on a file line by line, formats each line and store each formated line to an ArrayList (which serves as a multidimensional ArrayList
	public static ArrayList<String[]> loadDataFromFile(String name){
		
		// The Scanner object, scanObjec is going to take a new file
		Scanner scanObjec = null;
		
		// ArrayList
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		
		
		// Creating a method
		try { // Checking if the file exist
	    	
	    	
	    	// Create a File object
	    	// File fileObjec = new File("Student Assignment Scores.csv");
		      
	    	// Create a Scanner object to scan the file or to obtain the string content on the file
	    	// Scanner scanObjec = new Scanner(fileObjec);
	    	
	    	
	    	// Creating a Scanner object with the File object
	    	// This will also check if the file exist
	    	scanObjec = new Scanner(new File(name)); 
	    	
	    	
	    	// Printing the header of the columns names
	    	
	    	// Skip the first line or the header on the file, Student Assignment since we have already created a header
	    	scanObjec.nextLine();
	    	
	    	
	    	// Output the string content on the file, Student Assignment Scores.csv 
	    	// Using while loop
	    	while(scanObjec.hasNextLine()) { // Checking if each line of the file in the scanner object has text 
	    		
	    		// Saving each line of text as an Array String
	    		// Separating the words in each line's text or String Array using comma "," 
	    		// NOTE: On the file, Student Assignment Scores.csv, the text in each line is separated by a comma
	    		String[] formatedStudentAssignments = scanObjec.nextLine().split(",");
	    		
	    		// Add each formated text on each line on the file to the ArrayList, inquiryStudentScore
	    		data.add(formatedStudentAssignments);
	    		
	    	}
	    
	    	
	    	
	    } catch (Exception e) { // Catching errors
	    	
	    	e.printStackTrace();
	      
	    } finally{
	    	
	    	if(scanObjec != null) { // When the scanner object, scanObjec is not null
	    		
	    		// Close the scanner object, scanObjec
	    		scanObjec.close();
	    	}
	    }
		
		
			return data;
			
		}
	
	

}
