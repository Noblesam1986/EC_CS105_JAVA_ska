package week5;

import java.util.Scanner;

public class InputValidationString {

	public static void main(String[] args) {
		
		
		// Using Scanner for getting Input from user
					Scanner in = new Scanner(System.in); // Create a Scanner Object
					
					// Declaring variables
					String input = "";
					
					boolean valid = false;
					
					do {
						
						// Prompt the user to enter a string
						System.out.println("Do you like to code in Java?: ");
						
						// Using in.nextLine() to get the input from the user
						   input = in.nextLine();
						   
						   if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N") ) {  // If the user input is Y or y meaning yes
							   
							   			if(input.equalsIgnoreCase("Y")) {
							   				
							   				// If user input Y or y
											// Output That's great! I do too!
											System.out.println("That is great! I do too!" + "\n");
											
											// Outputting the Restart Line
											System.out.println("-----------------Restart----------------" + "\n");
							   				
							   			} else if(input.equalsIgnoreCase("N") ) {
							   					
							   			    // User inputs N or n
										    // Output: That's OK. There are many other wonderful things in life to learn.
											System.out.println("That's ok. There are many other wonderful things in life to learn." + "\n");	
											
											// Exit
											break;
							   			
							   			}
							  
							
							
							}  else {
								
									// Output: Invalid Response! Please answer with a 'Y' or 'N'. 
									System.out.println("Invalid Response! Please answer with a 'Y' or 'N'." + "\n");
								 
							   	
						            }
						   
						
						// then set valid = true
						// valid = true; // This will make the program exit the do-while loop
						
					} while(!valid); // the valid = true will exit this do-while loop
					
					
					in.close();  // Close Scanner input

	}

}
