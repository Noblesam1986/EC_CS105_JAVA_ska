package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FormLetter {

	public static void main(String[] args) {
		
		// Declaring 
		
		// Variables
		String assignmentFileName = "Student Assignment Scores.csv";
		String letterFileName = "Warning Letter to Student -.txt";
		String name = "";
		
		// Test
		// System.out.println("\nAssignment File Name: " + assignmentFileName);
		// System.out.println("\nStudent Letter File Name: " + letterFileName + "\n");
		
		// File
		File studentAssignScoresFileObject = null;
		File studentLetterFileObject = null;
		
		// Scanner 
		Scanner studentAssignScoresScanObject = null;
		Scanner studentLetterScanObject = null;
		
		// String Array
		String[] studentNameAndGradesArray = null;
		
		// ArrayList containing Strings
		ArrayList<String> studentsWithZeroScore = new ArrayList<String>();
		
		// ArrayList containing String Arrays
		ArrayList<String[]> studentNameAndScoresArrayList = new ArrayList<String[]>();
		
		// Creating an ArrayList for Student Name and Zero Assignment Numbers
		ArrayList <String> finalZeroStudentAssignNum = new ArrayList <String>();
		
		// Creating an ArrayList for Student Name and Zero Assignment Numbers
		ArrayList <String> finalZeroStudentAssignName = new ArrayList <String>();
		
		// PrintWriter
		PrintWriter zerostudentLetterWriterObject = null;
		
		
		
		// Use techniques acquired in previous labs to create two Scanner objects.
		// Creating File Objects
		studentAssignScoresFileObject = new File(assignmentFileName);
		studentLetterFileObject = new File(letterFileName);
		
		try{ // This will also check if the Student Assignment Grades.csv file exist
			
			// One Scanner will point to the "Student Assignment Grades.csv" file
			// Creating Scanner Objects
			studentAssignScoresScanObject = new Scanner(studentAssignScoresFileObject);
			
		
		} catch(FileNotFoundException e){
			
			// If file does not exist
			// e.printStackTrace();
			System.out.println(" The student assignment grade file does not exist");
			
		}
		
		try{ // This will also check if the file exist
			
			// One Scanner will point to the "Warning Letter to Student - .txt" file
			// Create a new Scanner object (studentLetterScanObject) that points to a File
			studentLetterScanObject = new Scanner(studentLetterFileObject);
			
		
		} catch(FileNotFoundException e){
			
			// If file does not exist
			// e.printStackTrace();
			System.out.println(" The student letter file does not exist");
			
		}
		
		
		// Read the full text of the "Warning Letter to Student - .txt" file and store it in a String variable.
		// Change the delimiter of the letter Scanner object to "\\Z" since you know that the string "\\Z" is not found anywhere in your .txt file.
		// The default delimiter is white space
		// useDelimiter
		studentLetterScanObject.useDelimiter("\\Z");
		
		// The .next() method retrieves the next 'token' from the scanner input.
		// A token is the next segment of text that comes from the Scanner before the next delimiter
		// A delimiter is a String or pattern what defines how tokens are broken up in an input stream
		
		// NB: Due to the change of the default delimiter from white space to "\\Z" that is not contained in the student letter file text
		// NB: The .next() will not stop but copy the entire text in the letter file since "\\Z" is not contained in the student letter file text		// A token is the next segment of text that comes from the Scanner before the next delimiter
		
		// NB: You do not need a while loop with .hasNext, while(studentLetterScanObject.hasNext()) {}
		String studentLetterQuote = studentLetterScanObject.next();
		
		// Test
		// ArrayList<String> studentLetterFormat = new ArrayList<String>();
		// System.out.println(studentLetterQuote);
		
		// Skip Heading
		studentAssignScoresScanObject.nextLine();
		
		// Read in the text from the "Student Assignment Scores.csv" file
		// One line at a time
		while(studentAssignScoresScanObject.hasNextLine()) {
			
			// Store each line from the Student Assignment Grades.csv into a String Array using split()
			// Each line from the Student Assignment Grades.csv contains a student's name and assignments grades
			// Using the split(",") will convert ... 
			// ... the String Student, Test 1, Test 2, Test 3
			// ... to the String Array [Student Test1 Test 2 Test 3]
			// For each student:
			
			// Test 
			
			
			// Each Line or Row
			// String Array
			studentNameAndGradesArray = studentAssignScoresScanObject.nextLine().split(",");
			
			// Save text from the Student Assignment Scores
			// Add String Array to an ArrayList
			
			// ArrayList containing String Arrays
			studentNameAndScoresArrayList.add(studentNameAndGradesArray);
			
		
			// Use the studentsWithZero method to get all students with we obtained zero in their marks
			studentsWithZeroScore  = studentsWithZero(studentNameAndScoresArrayList);
			
		}
			
			// Test
			// System.out.println("Student who had zero: " + studentsWithZeroScore);
		
			
			// Use PrintWriter to create a new text file for them (or any other method of file creation you prefer).
			// Make sure the name of the file is in the format described above.
			// Print the first line of the file using text and the student's name as shown in the Example Run.
			// Print the rest of the letter.
			// Use a for loop to evaluate each grade for the student.  If the grade is "0", print text to the file indicating the Assignment number as shown in the Example Run.
			
			// Creating Files
			System.out.println("Creating letters for: \n");
			
			// Getting all the students who had zero and the assignment number they obtained zero
			for(String studentNameAndAssignNum : studentsWithZeroScore) { // Get each element in the zero student ArrayList
				
				
				// Split each element or string using ":"
				String[] studentNameAndAssignmentArray = studentNameAndAssignNum.split(":");
				
				
				// Name of Student who obtained zero
				 String nameOfStudent = studentNameAndAssignmentArray[0];
				
				// Student's zero assignment numbers 
				// String assignmentNumber = studentNameAndAssignmentArray[1];
				
				// Creating an ArrayList for Student Name and Zero Assignment Numbers
				// Add student name and all the zero assignments numbers
				
				// if(name.eguals)
					//finalNameAndAssignNum
				
				// 
				
				// If student name is the same, save the zero assignment number 
				// Accepts only integers
			
				if(name.isEmpty()) { // If name is empty
					
					// name
					name = nameOfStudent;
					
					// Add the first zero assignment number into the temporal ArrayList
					finalZeroStudentAssignNum.add(studentNameAndAssignmentArray[1]);

					
				} else if(!name.isEmpty()) { // If name is not empty
					
						// Check if name is equal to String[0]
						if(name.equals(studentNameAndAssignmentArray[0])) {
							
							// If name is equal to the name from the next element
							finalZeroStudentAssignNum.add(studentNameAndAssignmentArray[1]);
							
						} else {// name is not the same as the student name stored in name
						
							
							// Clear the ArrayList
							finalZeroStudentAssignNum.clear();
							
							// Name
							name = studentNameAndAssignmentArray[0];
							
							// Start entering the zero assignment number of the next student
							finalZeroStudentAssignNum.add(studentNameAndAssignmentArray[1]);
							
							
							
							
						}
						
						// Print out the names of students who had zero in their assignments
						// System.out.println(name);
				}
				
				
				// Add Names of Students of students who had zero to an ArrayList
				
				// Add name when name is not yet included
				if(!finalZeroStudentAssignName.contains(name)) {
				
					finalZeroStudentAssignName.add(name);
				
				}
				
				
				// Test
				// System.out.println(finalStudentAssignNum);
				
				
				// Creating zero student letter title
				// Using PrintWriter
				// String zerostudentLetterTitle = "Warning Letter to Student -" + nameOfStudent + ".txt";
				 String zerostudentLetterTitle = "Warning Letter to Student -" + name + ".txt";
				
				// Test
				//System.out.println("Letter title: " + zerostudentLetterTitle + "\n");
				
				// Creating File Object for the file or letter
				try {
					// This will create the letter files
					zerostudentLetterWriterObject = new PrintWriter(zerostudentLetterTitle);
					
					
				} catch(FileNotFoundException e) {
					
					// If creating the files was unsuccessful
					// e.printStackTrace();
					System.out.println("Creating student letter files were not successfully.");
					
				}
				
				
				// Write letters to students who had zero in one of their assignments
				// Letter Format
				
				// Zero score assignment number
				// String assignmentNumberFormat = "Assignment " + assignmentNumber;
				String assignmentNumberFormat = "Assignment " + finalZeroStudentAssignNum;
			
				// Letter Introduction
				// String studentLetter = "Dear " + nameOfStudent + ", \n" + studentLetterQuote + "\n" + assignmentNumberFormat;
				String studentLetter = "Dear " + name + ", \n" + studentLetterQuote + "\n" + assignmentNumberFormat;
				
				zerostudentLetterWriterObject.println(studentLetter);
			
				// Test
				// System.out.println(studentLetter + "\n\n");
				
				
				// Flush the Writer Object after every loop
				zerostudentLetterWriterObject.flush();
				
			}
			
		
		// Print out the Names of students who had zero
			for(int r = 0; r < finalZeroStudentAssignName.size(); r++) {
				
				System.out.println(finalZeroStudentAssignName.get(r));
				
			}

			
			
		//Close the PrintWriter.
		if(zerostudentLetterWriterObject != null) { // When the scanner object passwordFileScanObject is not null
    		
    		// Close
			zerostudentLetterWriterObject.close();
			
		}
		
		// Close PrintWriter Object
		if(zerostudentLetterWriterObject != null) { // When the scanner object passwordFileScanObject is not null
    		
    		// Close
			zerostudentLetterWriterObject.close();
			
		}	
		
		
		
		
	
	}
	// Use methods you have learned in other labs to determine if a student has any assignments with a grade of "0"
			public static ArrayList<String> studentsWithZero(ArrayList<String[]> NameAndScoresArrayList){
				
				// String
				String eachStudentName = null;
				
				
				// ArrayList object which will contain Strings
				ArrayList<String> studentNameAndZeroScoreAssignNumArrayList = new ArrayList<String>();
				
				// Use methods you have learned in other labs to determine if a student has any assignments with a grade of "0"
				// For each line of text in the student assignment score file
				// Each line of text is also an Array of Strings
				for(String[] eachStudentRow : NameAndScoresArrayList) {
					
					
					// Test
					// System.out.println("Student's name: " + eachStudentName);
					
						// For each element in the selected line (or select row of a student)
						for(int m = 1; m < eachStudentRow.length; m++) {
							
							
							// Get student name
							eachStudentName = eachStudentRow[0];
							
							// Get Student's grades
							// Grades in String
							String eachStudentScoreString = eachStudentRow[m];
							
							// Test
							// System.out.println(eachStudentName + ": Assignment Number " + m + " score: " + eachStudentScoreString);
							
							
							// If a student has at least 1 grade of "0":
							if(eachStudentScoreString.equals("0")) {
								
								// Test
								// System.out.println(eachStudentName + ": Assignment Number " + m + " score: " + eachStudentScoreString);
								
								
								// If a student mark is zero, add the student name and assignment numbers
								
								// If the student who had zero in an assignment is not contained in the ArrayList
								// if(!studentNameAndZeroScoreAssignNumArrayList.contains(eachStudentName)) {
									
								//	studentNameAndZeroScoreAssignNumArrayList.add(eachStudentName);
									
								// }
								
								// Convert the integer r to String variable
								// studentNameAndZeroScoreAssignNumArrayList.add(Character.toString(c));
								// studentNameAndZeroScoreAssignNumArrayList.add(Character.toString()m);
								
								//Prepare element for the ArrayList eachStudentZeroScore
								String eachZeroStudentNameAndAssignNumString = eachStudentName + ":" + m;
								
								// Add to eachStudentZeroScore ArrayList
								studentNameAndZeroScoreAssignNumArrayList.add(eachZeroStudentNameAndAssignNumString);
								
							}
							
							
						}
					
				}
				
				// Test
				//System.out.println("Student's name and score: " + studentNameAndZeroScoreAssignNumArrayList);
				
				return studentNameAndZeroScoreAssignNumArrayList;
				
			}
	

}
