package week10;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScores {
	

	public static void main(String[] args) {
		
		// Creating an ArrayList
		// Will be used as a multidimensional ArrayList
		ArrayList<String[]> studentTestScores = loadDataFromFile("Student Test Grades.csv");
		
		 System.out.println();
		// Output a new report which contains Total Pay
		// printStudentReport(studentTestScores);
		 printStudentGrades(studentTestScores);
	  }
	
	
	
	// Create a method to check each student's test marks whether there is zero, 0
	public static void printStudentReport(ArrayList<String[]> studentAssignmentsScore) {
		
		// Output the header
    	// %n - new line
    	System.out.printf("%n%-20s%8s%8s%8s%n", "Student", "Test 1", "Test 2", "Test 3");
    	
    	// Output the underline below the header
    	
    	System.out.println("----------------------------------------------");
    	
    	for(String[] studentAssignments : studentAssignmentsScore) { // This will assign each element (or Array String) in the ArrayList, studentAssignmentsScore to the string variable studentAssignments for each iteration
    		
    		// Output each formated text on each line on the file, Student Assignment Scores.csv
    		System.out.printf("%n%-20s%8s%8s%8s%n", studentAssignments[0], studentAssignments[1], studentAssignments[2], studentAssignments[3]);
    	
    	}
		
	}
	
	
	
	
	// Printing students' grades
	public static void printStudentGrades(ArrayList<String[]> studentAssignmentsScore) {
		
		// Create a new string array to store the test grades
		String[] studentGradeArray = {"0","0","0"};
		
		// 
		String StudentTestGrade = "";
		
		// Output the header
		System.out.printf("%n%-20s%8s%8s%8s%n", "Student", "Test 1", "Test 2", "Test 3");
		
		System.out.printf("--------------------------------------------------\n");
		
		// Loop through the elements of ArrrayList
		for(String[] student : studentAssignmentsScore) { // For each String Array in the studentAssignmentsScore ArrayList
			
			// Loop within each String element of ArrayList
			for(int i = 1; i < student.length; i++) { // For each element in each String Array
				
				//
				int studentTestScore = Integer.parseInt(student[i]);
				if(studentTestScore <= 60) { 
					
					// When student obtain a mark below 60%
					StudentTestGrade = "E";
					
					// Replace the marks in each Array with grades
					
					
				} else if(studentTestScore > 60 && studentTestScore <= 64) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "D-";
					
					
				} else if(studentTestScore > 64 && studentTestScore <= 67) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "D";
					
					
				} else if(studentTestScore > 67 && studentTestScore <= 70) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "D+";
					
					
				} else if(studentTestScore > 70 && studentTestScore <= 74) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "C-";
					
					
				} else if(studentTestScore > 74 && studentTestScore <= 77) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "C";
					
					
				} else if(studentTestScore > 77 && studentTestScore <= 80) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "C+";
				
			   } else if(studentTestScore > 80 && studentTestScore <= 84) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "B-";
				
			   } else if(studentTestScore > 84 && studentTestScore <= 87) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "B";
				
			   } else if(studentTestScore > 87 && studentTestScore <= 90) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "B+";
				
			   } else if(studentTestScore > 90 && studentTestScore <= 94) {
					
					// When student obtain a mark below above 60% and below 64
					StudentTestGrade = "A-";
				
			   } else {
				   
				   // When student obtain a mark below above 60% and below 64
					StudentTestGrade = "A";
				   
			   }
			
			
			// Update the new array with student grades
			studentGradeArray[i-1] = StudentTestGrade;
			
			
		}
		
			System.out.printf("%n%-20s%8s%8s%8s%n", student[0], studentGradeArray[0], studentGradeArray[1], studentGradeArray[2]);
			
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
