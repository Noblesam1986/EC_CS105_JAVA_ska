package week5;

import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
	
	public static void main(String[] args) {
		
		
            
         // Using Scanner for getting Input from user
			Scanner in = new Scanner(System.in); // Create a Scanner Object
			
			// Declaring variables
			String input1 = "";
			
			// Counter
			int count = 1;
			
			do {  // Main Do-While Loop
						
							// Generating Random number within 1 and 100
							// Define the range
					        int max = 100;
					        int min = 1;
					        int range = max - min + 1; // 10-1+1 = 10
					 
					        int rand = (int)(Math.random() * range) + min;
					 
					        // Output is different every time this code is executed
					        // System.out.println(RAND);
				
					         
						// Output: This program is a guessing game.
						System.out.println("This program is a guessing game.");
						
						// Output: The computer will generate a random integer between 1 and 100. The user will try to guess the number.
						System.out.println("The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
						
						// Output: Let's get started!
						System.out.println("Let's get started!" + "\n");
						
						// Output: I'm thinking of a number between 1 and 100.
						System.out.println("I'm thinking of a number between 1 and 100.");
						
						// Output: What is your guess?
						System.out.println("What is your guess?");
						
							
									// Using in.nextLine() to get the input from the user
									input1 = in.nextLine();
								
									
				try {			
									// Convert the user numeric input into integer
									int inputNum = Integer.parseInt(input1); 
									
									// Check the user input which is converted to INT
									// System.out.println(inputNum);
									
						
									// Numerical Input Validation
								    if(inputNum > 1 && inputNum < 100){  // If the user input is an integer between 1 and 100
									   
								    	
									   			if(inputNum == rand) {
									   				
									   			    // System.out.println("The random number is: " + RAND);
									   				// Output: CORRECT! You guessed it in 3 tries!!
									   				System.out.println("CORRECT! You guessed it in " + count + " tries!" + "\n");
									   				
									   				// Ask user if he or she would like to play again
									   				System.out.println("Would you like to play again? (Y/N): " + "\n\n");
									   				
									   			// Declaring variables
													String input = "";
													
													boolean valid = false;
													
													do {
														
														// Using in.nextLine() to get the input from the user
														   input = in.nextLine();
														   
														   if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N") ) {  // If the user input is Y or y meaning yes
															   
															   			if(input.equalsIgnoreCase("Y")) {
															   				
															   				// User likes to play again
															   				break;
															   				
															   			} else if(input.equalsIgnoreCase("N") ) {
															   					
															   			    // User does not want to play again.
															   				System.out.println("bye.");
															   				System.exit(0);
															   			
															   			}
															  
															
															
															}  else {
																
																	// Output: Invalid Response! Please answer with a 'Y' or 'N'. 
																	System.out.println("Invalid Response! Please answer with a 'Y' or 'N'." + "\n");
																 
															   	
														            }
														   
														
														// then set valid = true
														// valid = true; // This will make the program exit the do-while loop
														
													} while(!valid); // the valid = true will exit this do-while loop
									   				
									   				
									   			
									   				
									   			} else {
										   					
										   					// Check whether the user guess is small or bigger
										   					if (inputNum < rand) {
										   						
										   					    // System.out.println("The random number is: " + RAND);
										   					    // Output: Your guess is too low. Try again 
											   					System.out.println("Your guess is too low. Try again. " + "\n");
										   						
										   						
										   					} else {
										   						  
										   					      // System.out.println("The random number is: " + RAND);
										   						  // Output: Your guess is too high. Try again 
										   						  System.out.println("Your guess is too high. Try again. " + "\n");	  
									   						
									   					      }
									   				 
									   			 }
								    		
								    
								    	
									
									
									} else {
										
											//
								  
									        }
								 
								    
								    
					} catch(Exception e) {
						
						
										// Output: Invalid Response! Please enter a whole number. 
										System.out.println("Invalid Response! Please enter a whole number." + "\n");
						
					}					    	
			  
				
				// Number of times tried
				// System.out.println("Number of Trials: " + count);
			    count++;	 
					
				
			} while(count < 100); // One user can play the game about a 100 times before restarting it.
			
			
			in.close();  // Close Scanner input
		
		
	}
	
	

}
