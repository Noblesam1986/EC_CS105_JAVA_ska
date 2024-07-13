package week6;

import java.util.Scanner;

public class RangeValidated {
	
	
	public static void main(String[] args) {
		
		
			// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in); // Create a Scanner Object
		
		// Define all variables
		int startNum = 0;
		int endNum = 0;
		int multiplyNum = 0;
		String playAgain = "";
		
		// Output 
		// In this program, we will display a series of numbers divisible by an integer specified by the user.
		// You will ask the user for the starting number, the ending number and the integer to be considered.
	    
	    System.out.println("This program will ask the user for three numbers:");
	    System.out.println("* A starting number");
	    System.out.println("An ending number");
	    System.out.println("* A multiplier");
	    System.out.println("* The program will multiply each number between the starting number and ending number by the multiplier. \n");
		
	    
	    // Input Validation - Play Again
	    boolean playAgainValid = false;
		do {
			
			    
									    // Input Validation - Starting number
									    boolean startNumvalid = false;
										do {
											
											// Ask user to enter the starting number
										    System.out.println("Enter the starting number: ");
											
											   try {
												   
												   // Store the input value as an integer
												   // Check whether the input is an integer
												   startNum = Integer.parseInt(in.nextLine());
												   
												   // If the parseIn() statement ran smoothly
												   // then set valid = true
												   startNumvalid = true; // This will make the program exit the do-while loop
												   
											   } catch(Exception e) {
												   
												   // Prompt the user to enter a whole number.
												   System.out.println("Invalid Response! Please enter a whole number." + "\n");
												   
											   } // End of Try-Catch
											
										} while(!startNumvalid); // the valid = true will exit this do-while loop
										
										
										
										
									    // Input Validation - Ending number
									    boolean endNumvalid = false;
										do {
											
											 // Ask user to enter the ending number
										    System.out.println("Enter the ending number: ");
											
											   try {
												   
												   // Store the input value as an integer
												   // Check whether the input is an integer
												   endNum = Integer.parseInt(in.nextLine());
												   
												   // If the parseIn() statement ran smoothly
												   // then set valid = true
												   endNumvalid = true; // This will make the program exit the do-while loop
												   
											   } catch(Exception e) {
												   
												   // Prompt the user to enter a whole number.
												   System.out.println("Invalid Response! Please enter a whole number." + "\n");
												   
											   } // End of Try-Catch
											
										} while(!endNumvalid); // the valid = true will exit this do-while loop
										
										
										
										// Input Validation - Testing number
									    boolean multiplyNumvalid = false;
										do {
											
											// Ask user to enter the test number:
										    System.out.println("Enter the multiplier: ");
											
											   try {
												   
												   // Store the input value as an integer
												   // Check whether the input is an integer
												   multiplyNum = Integer.parseInt(in.nextLine());
												   
												   // If the parseIn() statement ran smoothly
												   // then set valid = true
												   multiplyNumvalid = true; // This will make the program exit the do-while loop
												   
											   } catch(Exception e) {
												   
												   // Prompt the user to enter a whole number.
												   System.out.println("Invalid Response! Please enter a whole number." + "\n");
												   
											   } // End of Try-Catch
											
										} while(!multiplyNumvalid); // the valid = true will exit this do-while loop
			    
			    
										
										
				// When all inputs are validated
										
				// Print the numbers
				for (int i = startNum; i >= startNum && i<= endNum; i++) {
					
					// If i starts from startNum and ends at endNum
					
					int multiplyAns = i * multiplyNum;
					
						
							System.out.println("Multiplying " + i + " by " + multiplyNum + " results in: " + multiplyAns + "\n"); // Print the i value
						     
					   
				
				}
				
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
					
					
				} while(!playAgainOption);
					
	
	
		} while(!playAgainValid);
	    
	    
		in.close();  // Close Scanner input
		
		
	}
	

}
