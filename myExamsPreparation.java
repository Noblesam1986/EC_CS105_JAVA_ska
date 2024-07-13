package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class myExamsPreparation {
	
	public static void main(String[] args) {
		
		// Declaring
		// To be in the scope of all methods
		PrintWriter writerObject = null;
		Scanner textInsideFileScannerObject = null;
		
		// Take input from user
		// Input Scanner Object
		Scanner userInputScannerObject = new Scanner(System.in);
		
		// Output something to user in the console
		System.out.println("Enter name: ");
		
		// Take input user
		String userReponse = userInputScannerObject.nextLine();
		
		// Output what user input
		System.out.println(userReponse);
		
		// Take String input which are numbers and convert them to other Primitive datatype
		System.out.println("Enter a decimal number: "); 
		
		String parsingFromStringToOther = userInputScannerObject.nextLine();
		
		// Parse
		// To Integer
		Double decimalInt = Double.parseDouble(parsingFromStringToOther);
		
		System.out.println(decimalInt);
		
		
		// Using equals to in Java
		// Returns a boolean true or false
		String Kofi = "Mensa";
		if(Kofi.equals("Mensa")){
			
			System.out.println("It is true");
		}
		
		// Using equals to regardless of Capital letter
		if(Kofi.equalsIgnoreCase("mensa")){
			
			System.out.println("It does not matter whether there was a capital letter in it.");
			
		}
		
		
		// Math.random()
			
			  double randomNumber =  Math.random();
			  
			  System.out.println(randomNumber);
			  
		// Generating random numbers between 1 and 100
		double myRandomNumber = 100 * Math.random();
		
		System.out.println(myRandomNumber);
		
		// Converting double to integer
		// Type Casting
		
		int myRandomNumberConvertToInt = (int)myRandomNumber;
		System.out.println(myRandomNumberConvertToInt);
		
		
		// Converting Data in Primitive Type into the Data's Object and using the object to convert the dataType
		
		
		
		// User Input Y (Yes) or N (No)
	    System.out.println("Please enter Y or N: ");
		
	    // When user input something else
	    // Send user error message and ask user to type the correct thing
	    // Note: Keep looping until user chooses the right answer
	    
	    boolean choose = false;
	    do {
	    	
	    	 String answer = userInputScannerObject.nextLine();
	    	 if(answer.equalsIgnoreCase("Y")){
	    		 
	    		 // When user selects Y or y (Yes)
	    		 
	    		 choose = true;
	    		 
	    	 } else if(answer.equalsIgnoreCase("N")) {
	    		 
	    		 // When user selects N or n (No)
	    		 
	    		 choose = true;
	    		 
	    	 } else {
	    		 
	    		 // When user enters wrong input
	    		 System.out.println("Please enter Y or N: ");
	    		 
	    		 
	    		 
	    	 }
	    	
	    	
	    } while(!choose);
		
		
		// Check for Errors
	    try {
	    	
	    	// Reading text from file
	    	File fileToBeRead = new File("Student Assignment Scores.csv");
	    	
	    	// This throws error if the file does not exist
	    	textInsideFileScannerObject = new Scanner(fileToBeRead);
	    	
	    	// If there is no error or the file exist
	    	
	    	
	    	// Creating a new ArrayList to save the text read from the file to
	    	ArrayList<String> copiedTextFromFile = new ArrayList<String>();
	    	
	    	while(textInsideFileScannerObject.hasNextLine()) {
	    		
		    	// Read file and copy into An ArrayList 
		    	String readText = textInsideFileScannerObject.nextLine();
		    	
		    	// Add to ArrayList
		    	
		    	copiedTextFromFile.add(readText);
	    	
	    	
	    	}
	    
	    	// Output
	    	System.out.println(copiedTextFromFile);
	    	
	    } catch(FileNotFoundException e) {
	    	
	    	// e.printStackTrace();
	    	System.out.println("File not found.");
	    	
	    }
		
	    
	    try {
			    
	    	// Creating the PrintWriter Object
			writerObject = new PrintWriter("PrintWriterTestNotebook.txt");
			
			
			// Accept user input
			System.out.println("If you see something, say something. ");
			
			// Take user input
			String userHasResponded = userInputScannerObject.nextLine();
			
			// Write user input to file
			writerObject.println(userHasResponded);
			
			// Output
			System.out.println(userHasResponded);
			
			
			// Flush PrintWriter
			writerObject.flush();
			
	    } catch(Exception e) {
	    	
	    	// Exception
	    	// e.printStackTrace();
	    	
	    	// File does not exist or file was not created
	    	System.out.println("File does not exist or file was not created.");
	    	
	    }
	    
	    // Close Scanners and PrintWriter
	    writerObject.close();
	    textInsideFileScannerObject.close();
	    
	    
	    // String Object - All Strings are objects
	    String testingStringObject = "Kofi:Ama" ;
	   
	    String[] splittedWithColon = testingStringObject.split(":");
	    
	    
	    // Create an ArrayList
	    ArrayList<String[]> splittedWithColonArrayList = new ArrayList<String[]>();
	    
	    // Add String[] to ArrayList
	    splittedWithColonArrayList.add(splittedWithColon);
	    
	    // This will copy all the elements in the ArrayList
	    for(String[] copiedFromArrayList:splittedWithColonArrayList){
	    	
	    	for(int i = 0; i < copiedFromArrayList.length; i++) {
	    		
	    		// Output
			    System.out.println(copiedFromArrayList[i]);
	    		
	    	}
	    	
		    
	    
	    }
	    // Test useDelimiter
	    // Helps you end copying test at a point
	    
		
		// Close scanner
		userInputScannerObject.close();
	}
	

}
