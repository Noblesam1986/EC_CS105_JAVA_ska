/**
* Names: Student Name
*/
package week9;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidationMethods {

	public static void main(String[] args) {
		//Initialize local variables
	    Scanner sIn = new Scanner(System.in);	//Input Scanner for String
		int intNum = 0;
		double doubleNum = 0;
		String choice = "";
		String playAgain = "Y";
		
		//Keep program running until user wants to quit		
	    do {
	    	//Get an integer from the user
	    	int[] intRange1 = {}; 
	        intNum = getValidInt(sIn, "Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.",intRange1);
	        System.out.println("The whole number your entered was: "+ intNum);
	        System.out.println("Now we will test your whole number in a math equation...");
	        System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n\n",intNum, (intNum + 10));

	        //Get an integer within a range from the user
	    	int[] intRange2 = {10, 50}; 
	        intNum = getValidInt(sIn, "Please enter a whole number between 10 and 50: ", "Invalid response. Only whole numbers between 10 and 50 are acceptable.",intRange2);
	        System.out.println("The whole number your entered was: "+ intNum);
	        System.out.println("Now we will test your whole number in a math equation...");
	        System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n\n",intNum,(intNum + 10));

	        //Get a Double from the user
	        double[] doubleRange1 = {}; 
	        doubleNum = getValidDouble(sIn, "Please enter a floating-point number: ", "Invalid response. Only floating-point numbers are acceptable.",doubleRange1);
	        System.out.println("The float your entered was: " + doubleNum);
	        System.out.println("Now we will test your floating-point number in a math equation...");
	        System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n\n", doubleNum, (doubleNum + 10));

	        //Get a Double within a range from the user
	        double[] doubleRange2 = {5.5, 10.75}; 
	        doubleNum = getValidDouble(sIn, "Please enter a floating-point number between 5.5 and 10.75: ", "Invalid response. Only floating-point numbers between 5.5 and 10.75 are acceptable.",doubleRange2);
	        System.out.println("The float your entered was: " + doubleNum);
	        System.out.println("Now we will test your floating-point number in a math equation...");
	        System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n\n", doubleNum, (doubleNum + 10));
	        
	        //Get either an "a", "b" or "c" from the user
	        String[] options1 = {"a","b","c"};
	        choice = getValidString(sIn, "Please enter 'a', 'b' or 'c': ", "Invalid response. Only the letters 'a', 'b' or 'c' are acceptable.", options1);
	        System.out.printf("The letter your entered was: %s\n\n", choice);

	        //Get a word from the user
	        String[] options2 = {"Chocolate","Vanilla","Strawberry"};
	        choice = getValidString(sIn, "Please choose either Chocolate, Vanilla or Strawberry: ", "Invalid response. Only 'Chocolate', 'Vanilla' and 'Strawberry' are acceptable answers.",options2);
	        System.out.printf("You chose: %s\n\n", choice);

	        //Get a 'Y' or 'N' from the user
	        String[] options3 = {"Y","y","N","n"};	        
	        playAgain = getValidString(sIn, "Would you like to play again? (Y/N): ", "Invalid response.  Please answer with a 'Y' or 'N'", options3);	
	    }while(playAgain.equalsIgnoreCase("Y"));

	}//end of method main()

	
	/**getValidInt method validates user input is an Integer within range and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If range is empty, range is ignored and only validates input is an integer.
	 * If range is not empty, validates user input is an integer within range.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static int getValidInt(Scanner sIn, String question, String warning, int[] range){
		
		int inputValid = 0;
		
		// If integer Array, range is empty
		
		
		// Check the number of elements in integer array, range
		int numElements = range.length;
					
		if(numElements == 0) { // When the Array, range does not contain any elements, integer intRange1 = {}
						
			
						// Validate user input
					    boolean validInt1 = false;
						do {
						
							// Ask user to enter a whole number
							System.out.println(question);
								
							
								// Check whether input is an integer or whole number
								try {	
										// Get the input from the user
										String inputRaw = sIn.nextLine();
										
										// Validate the number user enters
										inputValid = Integer.parseInt(inputRaw);
										
										// Break out from the do while loop
						    		    validInt1 = true;
								
									} catch(Exception e) { // When input is not an integer or whole number
									
										// When user enters an input which is not a whole number
										System.out.println(warning);
									
									}
							
						} while(!validInt1);
		
		
		} else{ // When the Array, range contains elements, integer intRange2 = {10, 50}; 
			
					// Validate user input
				    boolean validInt2 = false;
					do {
					
						// Ask user to enter a whole number
						System.out.println(question);
							
						
							// Check whether input is an integer or whole number
							try {	
									// Get the input from the user
									String inputRaw = sIn.nextLine();
									
									// Validate the number user enters
									inputValid = Integer.parseInt(inputRaw);
									
									// Break out from the do while loop
					    		    
							
								} catch(Exception e) { // When input is not an integer or whole number
								
									// When user enters an input which is not a whole number
									// System.out.println(warning);
								
								}
							
							
							// Get the low and high values from the integer Array, range
							int lowInput = range[0];
							int highInput = range[1];
							
							// Checking whether the whole number is between 10 and 50
							if(inputValid >= lowInput && inputValid <= highInput) {
								
								// If the number is not between 10 and 50
								validInt2 = true;
								
								
							} else {
								
								// When user enters a whole number which is not between 10 and 50
								System.out.println(warning);
								
							}
								
							
							
						
					} while(!validInt2); // Continue looping until validInt2 is true
			
					
					
					
			
		}	// End of if integer loop
						
		
		// When user enters a whole number, return the whole number to the calling function
		return inputValid;
		
		

	}//end of method getValidInt(Scanner, String, String, int[])
		
	
	/**getValidDouble method validates user input is a double within range and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If range is empty, range is ignored and only validates input is an double.
	 * If range is not empty, validates user input is a double within range.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static double getValidDouble(Scanner sIn, String question, String warning, double[] range){
		
		
		double inputValid = 0;
		
		// If integer Array, range is empty
		
		
		// Check the number of elements in integer array, range
		int numElements = range.length;
					
		if(numElements == 0) { // When the Array, range does not contain any elements, double intRange1 = {}
						
			
						// Validate user input
					    boolean validInt3 = false;
						do {
						
							// Ask user to enter a whole number
							System.out.println(question);
								
							
								// Check whether input is double
								try {	
										// Get the input from the user
										String inputRaw = sIn.nextLine();
										
										// Validate the number user enters
										inputValid = Double.parseDouble(inputRaw);
										
										// Break out from the do while loop
						    		    validInt3 = true;
								
									} catch(Exception e) { // When input is not an integer or whole number
									
										// When user enters an input which is not a whole number
										System.out.println(warning);
									
									}
							
						} while(!validInt3);
		
		
		} else{ // When the Array, range contains elements, integer intRange2 = {10, 50}; 
			
					// Validate user input
				    boolean validInt4 = false;
					do {
					
						// Ask user to enter a whole number
						System.out.println(question);
							
						
							// Check whether input is an integer or whole number
							try {	
									// Get the input from the user
									String inputRaw = sIn.nextLine();
									
									// Validate the number user enters
									inputValid = Double.parseDouble(inputRaw);
									
									// Break out from the do while loop
					    		    
							
								} catch(Exception e) { // When input is not an integer or whole number
								
									// When user enters an input which is not a whole number
									// System.out.println(warning);
								
								}
							
							
							// Get the low and high values from the integer Array, range
							double lowInput = range[0];
							double highInput = range[1];
							
							// Checking whether the whole number is between 5.5 and 10.75
							if(inputValid >= lowInput && inputValid <= highInput) {
								
								// If the number is not between 10 and 50
								validInt4 = true;
								
								
							} else {
								
								// When user enters a whole number which is not between 10 and 50
								System.out.println(warning);
								
							}
								
							
							
						
					} while(!validInt4); // Continue looping until validInt2 is true
			
					
					
					
			
		}	// End of if integer loop
						
		
		// When user enters a whole number, return the whole number to the calling function
		return inputValid;
		
		
		
		

	}//end of method getValidDouble(Scanner, String, String, double[])		
	
	
	/**getValidString method validates user input is within list of choices and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If choices is empty, returns input.
	 * If choices is not empty, validates user input is within choices.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static String getValidString(Scanner sIn, String question, String warning, String[] choices){
		
		ArrayList<String> choicesArrayList = new ArrayList<String>();
		
		String inputValid = "";
		String inputRaw = "";
		
		// If integer Array, range is empty
		
		
		// Check the number of elements in integer array, range
		int numElements = choices.length;
					
		if(numElements == 0) { // When the Array, choices does not contain any elements
						
			
						// Validate user input
					    boolean validInt5 = false;
						do {
						
							// Ask user to enter a whole number
							System.out.println(question);
								
							
								// Check whether input is double
								try {	
										// Get the input from the user
										inputRaw = sIn.nextLine();
										
										// Validate the number user enters
										// inputValid = Double.parseDouble(inputRaw);
										
										// Break out from the do while loop
						    		    validInt5 = true;
								
									} catch(Exception e) { // When input is not an integer or whole number
									
										// When user enters an input which is not a whole number
										System.out.println(warning);
									
									}
							
						} while(!validInt5);
		
		
		} else{ // 
			
					// Validate user input
				    boolean validInt6 = false;
					do {
					
						// Ask user to enter a whole number
						System.out.println(question);
							
						
							// Check whether input is an integer or whole number
							try {	
									// Get the input from the user
									inputRaw = sIn.nextLine();
									
									// Validate the number user enters
									// inputValid = Double.parseDouble(inputRaw);
									
									// Break out from the do while loop
					    		    
							
								} catch(Exception e) { // When input is not an integer or whole number
								
									// When user enters an input which is not a whole number
									// System.out.println(warning);
								
								}
							
							// Converting Array into ArrayList
							
							for (int r = 0; r < choices.length; r++) {
								
								// Get each element from the Array, choices
								String eachElement = choices[r];
								
								// Add the element to a new ArrayList, choicesArrayList
								choicesArrayList.add(eachElement);
								
							}
							
							if(choicesArrayList.contains(inputRaw)) {
								
								// If the ArrayList, choicesArrayList contains the user input
								// Break main loop, do while
								validInt6 = true;
								
							
							} else {// If the ArrayList, choicesArrayList does not contains the user input
								
								// User should enter a choice from the list given
								System.out.println(warning);
								
								
							}
								
						
					} while(!validInt6); // Continue looping until validInt2 is true
					
					// If user input y instead of Y
					// Play again
					if(inputRaw.equals("y")) {
						
						inputRaw = "Y";
						
					}
					
					return inputRaw;
					
					
			
		}	// End of if integer loop
						
		
		// When user enters a whole number, return the whole number to the calling function
		return inputRaw;
		
		
		

	}// end of method getValidString(Scanner, String, String, String[])
	
}//end of class Lab9iStartCode
