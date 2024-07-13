package week7;

import java.util.Scanner;

public class IsBetween {

	

	public static boolean isBetween(int a, int b, int c){ // void returns a boolean
		
		
		// Determine which of the three numbers is the largest 
		
				if(b > a && b < c) {  // I included =, because for example, using 30, 30 and 2, without the =, it would choose 2 as the highest.
										
					// Then the second number is between the first number and the third number
					// Return true
					boolean checkInBetween = true;
					
					return checkInBetween;
					
					
				} else {
					
					// Then the second number is not between the first number and the third number
					// Return false
					boolean checkInBetween = false;
					
					return checkInBetween;
				}
				
		
	}

	
	
	
	public static void main(String[] args) {
	
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in); // Create a Scanner Object
		
		// Define all variables
		int numFirst= 0;
		int numSecond = 0;
		int numThird = 0;
		//User play again variable
		String playAgain = "";
		
		// Output - This program will ask the user for three numbers and determine if the second number lies between the first and the third.
		System.out.println("This program will ask the user for three numbers and determine if the second number lies between the first and the third. \n");
		
		
		// Play Again
	    boolean playAgainValid = false;
		do {
				
				// Asks the user for three whole numbers
				
				
				// Input Validation - First number
			    boolean firstNumvalid = false;
				do {
					
					// Enter the first number: 
					System.out.println("Please enter the low number: ");
					
					   try {
						   
						    // Store the input value as an integer
							// Check whether the input is an integer
							numFirst = Integer.parseInt(in.nextLine());
						   
						   // If the parseIn() statement ran smoothly
						   // then set valid = true
						   firstNumvalid = true; // This will make the program exit the do-while loop
						   
					   } catch(Exception e) {
						   
						   // Prompt the user to enter a whole number.
						   System.out.println("Invalid Response! Please enter a whole number." + "\n");
						   
					   } // End of Try-Catch
					
				} while(!firstNumvalid); // the valid = true will exit this do-while loop
				
				
				
				// Input Validation - Second number
			    boolean secondNumvalid = false;
				do {
					
					// Enter the second number: 
					System.out.println("Please enter the number to be tested (the between number): ");
					
					   try {
						   
						    // Store the input value as an integer
							// Check whether the input is an integer
							numSecond = Integer.parseInt(in.nextLine());
						   
						   // If the parseIn() statement ran smoothly
						   // then set valid = true
						   secondNumvalid = true; // This will make the program exit the do-while loop
						   
					   } catch(Exception e) {
						   
						   // Prompt the user to enter a whole number.
						   System.out.println("Invalid Response! Please enter a whole number." + "\n");
						   
					   } // End of Try-Catch
					
				} while(!secondNumvalid); // the valid = true will exit this do-while loop
				
				
				
				// Input Validation - Third number
			    boolean thirdNumvalid = false;
				do {
					
					// Enter third number: 
					System.out.println("Please enter the high number: ");
					
					   try {
						   
							// Store the input value as an integer
							// Check whether the input is an integer
							numThird = Integer.parseInt(in.nextLine());
						   
						   // If the parseIn() statement ran smoothly
						   // then set valid = true
						   thirdNumvalid = true; // This will make the program exit the do-while loop
						   
					   } catch(Exception e) {
						   
						   // Prompt the user to enter a whole number.
						   System.out.println("Invalid Response! Please enter a whole number." + "\n");
						   
					   } // End of Try-Catch
					
				} while(!thirdNumvalid); // the valid = true will exit this do-while loop
				
				
				
				// Call a SECOND METHOD, largestNumber()
				// Pass the three numbers as arguments
				boolean checkedInBetween = isBetween(numFirst, numSecond, numThird);
				
				// Condition
				if(checkedInBetween){
				
						// It it returns true
						// Print example, 42 lies between the numbers 40 and 45
						System.out.println(numSecond + " lies between the numbers " + numFirst + " and " + numThird);
				
				} else{
					
					// It it returns false
					// Print example, 16 DOES NOT lie between the numbers 50 and 189.
					System.out.println(numSecond + " DOES NOT lie between the numbers " + numFirst + " and " + numThird);
					
				}
				
				// PLAY AGAIN
				// Ask user if he or she wants to play again - The answer should be Y or N.
				System.out.println("Would you like to play again? (Y/N): ");
				
				boolean playAgainOption = false;
				do {
					// Using in.nextLine() to get the input from the user
					playAgain = in.nextLine();
					
					
				   
					if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N") ) {  // If the user input is Y or y meaning yes
					   
					   			if(playAgain.equalsIgnoreCase("Y")) {
					   				
						   				// User likes to play again
						   			    
						   				// Exit this loop
					   				    // break;
					   					
					   					// Creating next line to restart the game
					   			         System.out.println("\n");
					   			        
					   			        // Exit this inner loop
						   				playAgainOption = true; // Exit from this loop and continue with mother loop - This will restart the program.
						   				
					   				
					   			} else if(playAgain.equalsIgnoreCase("N") ) {
					   					
						   			    // User does not want to play again.
						   				// System.out.println("bye.");
						   				
						   				// Exit the program
					   				    System.exit(0);
					   			
					   			}
					  
					
					
					  }  else {
						
								// Output: Invalid Response! Please answer with a 'Y' or 'N'. 
								System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
						 
				         }
					
					
				     } while(!playAgainOption); // Ends User's Y or N answer to play again or not
				
				
				
				
				// in.close();  // Close Scanner input
						
						
						
		} while(!playAgainValid);

} 
	

}
