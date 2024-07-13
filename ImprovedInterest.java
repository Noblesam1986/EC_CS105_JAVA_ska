package week6;

import java.util.Scanner;

public class ImprovedInterest {

	public static void main(String[] args) {
		
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		
		// Variables
		int numMonths = 0;
		double monthlyDeposit = 0;
		double annualRate = 0;
		String playAgain = "";
		
		
	    boolean newCalValid = false;
		do {
					
					
					// Input Validation - Monthly deposit
				    boolean depositValid = false;
					do {
						
						// Ask for the amount to be deposited every month
					System.out.println("Please enter the amount to be deposited each month:");
						
						   try {
							   
							   // Store the input value as an integer
							   // Check whether the input is an integer
							   monthlyDeposit = Double.parseDouble(in.nextLine());
							   
							   // If the parseIn() statement ran smoothly
							   // then set valid = true
							   depositValid = true; // This will make the program exit the do-while loop
							   
						   } catch(Exception e) {
							   
							   // Prompt the user to enter a whole number.
							   System.out.println("Invalid response! Please enter a number." + "\n");
							   
						   } // End of Try-Catch
						
					} while(!depositValid); // the valid = true will exit this do-while loop
					
					
					
					// Input Validation - Annual interest rate in percentage
				    boolean annualRateValid = false;
					do {
						
						// Ask for the annual interest rate percent - Just the number without the /100 or Percent
					    System.out.println("Please enter the annual interest rate percent:");
						   try {
							   
							    annualRate = Double.parseDouble(in.nextLine());
							   
							   // If the parseIn() statement ran smoothly
							   // then set valid = true
							   annualRateValid = true; // This will make the program exit the do-while loop
							   
						   } catch(Exception e) {
							   
							   // Prompt the user to enter a whole number.
							   System.out.println("Invalid response! Please enter a number." + "\n");
							   
						   } // End of Try-Catch
						
					} while(!annualRateValid); // the valid = true will exit this do-while loop
			
				    
					// Input Validation - Annual interest rate in percentage
				    boolean numMonthValid = false;
					do {
						
						// Ask for the number of Months
						System.out.println("Please enter the number of months you plan to save:");
						   try {
							   
							    numMonths = Integer.parseInt(in.nextLine());
							   
							   // If the parseIn() statement ran smoothly
							   // then set valid = true
							    numMonthValid = true; // This will make the program exit the do-while loop
							   
						   } catch(Exception e) {
							   
							   // Prompt the user to enter a whole number.
							   System.out.println("Invalid response! Please enter a number." + "\n");
							   
						   } // End of Try-Catch
						
					} while(!numMonthValid); // the valid = true will exit this do-while loop
					
					// Calculating rate per month
				    double monthlyRate = annualRate/100/12;
				    
				    // Balance after one month
				    double balanceAmount = monthlyDeposit*(1 + monthlyRate);
				    
				    // Output 1st Month Balance
				    int i = 1;
				    System.out.printf("The following table shows the balance of the account for each month of the designated savings period. \n");
			    	System.out.printf("Month " + i + ":      " + "$%,.2f\n", balanceAmount);
				    
			    	
				    // Using For loop for the other months
				    for(i = 2; i <= numMonths; i++) {
				    	
				    	// Balance for the rest of the months chosen
					    balanceAmount = (monthlyDeposit + balanceAmount)*(1 + monthlyRate);
						
				    	// Output
				    	System.out.printf("Month " + i + ":      " + "$%,.2f\n", balanceAmount);
				    	
		    	
		           }
		    
				 
		    // Ask user if he or she wants to play again - The answer should be Y or N.
			System.out.println("Would you like to make another calculation? (Y/N): ");
			
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
			
			
			
			
		} while(!newCalValid);
		
	
		in.close();
		
	}
	

}
