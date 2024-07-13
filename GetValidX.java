package week7;

import java.util.Scanner;

public class GetValidX {
	
		
		// The getValidInt Method
		public static int getValidInt(Scanner in, String b, String c){ 
				
			    // Scanner in = new Scanner(System.in);
			
				// Declare Variables
				int checkInt = 0;
					
				// Input Validation - Integer
			    boolean intValidate = false;
				do {
					
					// Prompt user to enter a whole number
				    System.out.println(b);
					
					   try {
						   
						// Store the input value as an integer
							// Check whether the input is an integer
							checkInt = Integer.parseInt(in.nextLine());
						   
							// Break out of loop when integer check is successful
							break;
							
						   
					   } catch(Exception e) {
						   
						   // Prompt the user to enter a whole number.
						   System.out.println(c + "\n");
						   
					   } // End of Try-Catch
					
				} while(!intValidate); // the valid = true will exit this do-while loop
				
				
				
				// Determine which of the three numbers is the largest 
				return checkInt;
				
						
		}
	

		
	
		// The getValidDouble Method
				public static double getValidDouble(Scanner in, String f, String g){ 
						
					    // Scanner in = new Scanner(System.in);
					
						// Declare Variables
						double checkDouble = 0;
							
						
						// Input Validation - Double
					    boolean doubleValidate = false;
						do {
							
							// Please enter a decimal-point number: 
						    System.out.println(f);
							
							   try {
								   
								// Store the input value as an integer
									// Check whether the input is an integer
								   checkDouble = Double.parseDouble(in.nextLine());
								   
									// Break out of loop when integer check is successful
									break;
									
								   
							   } catch(Exception e) {
								   
								   // Prompt the user to enter a whole number.
								   System.out.println(g + "\n");
								   
							   } // End of Try-Catch
							
						} while(!doubleValidate); // the valid = true will exit this do-while loop
						
						
						
						// Determine which of the three numbers is the largest 
						return checkDouble;
						
								
				}
		
				
				//
				// NOTE: I SHOULD HAVE JUST RETURN THE USER INPUT Y OR N AFTER VALIDATION FOR THE main METHOD TO CONTINUE EXECUTION
				// THE PLAY AGAIN EXIT OR CONTINUE WOULD BE DONE BY THE main METHOD NOT YOUR METHOD
				
				// The getValidYN Method
				public static String getValidYN(Scanner in, String k, String l){ 
					
						
					    // Scanner in = new Scanner(System.in);
					    
					  // Defining variables
						String playAgain = "";
					    
					 // PLAY AGAIN
						// Ask user if he or she wants to play again - The answer should be Y or N.
						System.out.println(k);
						
						boolean playAgainOption = false;
						do {
							
							
							// Using in.nextLine() to get the input from the user
							playAgain = in.nextLine();
							
							
						   
							if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N") ) {  // If the user input is Y or y meaning yes
							   
							   			if(playAgain.equalsIgnoreCase("Y")) {
							   				
								   				// User likes to play again
								   				// Exit this loop
							   				    // break;
							   				    
							   					// Exit this inner loop
							   					playAgainOption = true; // Exit from this loop and continue with mother loop - This will restart the program.
								   				
							   				
							   			} else if(playAgain.equalsIgnoreCase("N") ) {
							   					
											   			// Exit the program
										   				    System.exit(0);
							   			
							   			}
							  
							
							
							  }  else {
								
										// Output: Invalid Response! Please answer with a 'Y' or 'N'. 
										System.out.println(l);
								 
						         }
							
							
						     } while(!playAgainOption); // Ends User's Y or N answer to play again or not
						
						
						return playAgain;
								
				}
	
				
				
				
				
	// The MAIN Method
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Play the game until the user says they don't want to play again.
		String playAgain = "Y";

		while (playAgain.equalsIgnoreCase("Y")) {
			// Get an integer from the user
			int intNum = getValidInt(in, "Please enter a whole number: ",
					"Invalid Response! Please enter a whole number.");
			System.out.printf("The whole number your entered was: %d.%n", intNum);
			System.out.println("Now we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.%n", intNum, intNum + 10);
			System.out.println();

			// Get a floating-point from the user
			double doubleNum = getValidDouble(in, "Please enter a decimal-point number: ",
					"Invalid Response! Please enter a number.");
			System.out.printf("The float your entered was: %f.%n", doubleNum);
			System.out.println("Now we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.%n", doubleNum, doubleNum + 10);
			System.out.println();

			// Get a 'Y' or 'N' from the user
			playAgain = getValidYN(in, "Would you like to play again? (Y/N): ",
					"Invalid Response! Please answer with a 'Y' or 'N'");
			System.out.println();
		} // end of while (playAgain.equalsIgnoreCase("y"))

		System.out.println("Goodbye!");
		in.close();

	}// end of Main()

}
