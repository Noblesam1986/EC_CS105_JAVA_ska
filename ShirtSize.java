package week4;

import java.util.*;

public class ShirtSize {

public static void main(String[] args) {
		
	// Using Scanner for getting Input from user
			Scanner in = new Scanner(System.in);
			
			 
			
			// Prompting the user for the measurement of the customer’s chest. 
			System.out.println("Please enter the customer's chest measurement in inches:");
			
			// Using in.nextLine()
			// User's input is stored into a variable called input 
			String input = in.nextLine();
			
			// Converting the user input into an integer using Integer.parseInt() 
			// Storing the converted value into a variable called chestSize.
			int chestSize = Integer.parseInt(input);
			
			// Writing an if statement that checks to see if chestSize is less than 38 inches
			if (chestSize < 38) {
				
				  // If it is true, print the appropriate shirt size (S)
				     System.out.println("A customer with a chest measurement of " + chestSize + " " + "inches needs to order a size S.");
				
				  
				} else if (chestSize >= 38 && chestSize < 40) { //If chestSize is greater than or equal to 38 inches and less than 40 inches   
					
				    // If it is true, print the appropriate shirt size (M)
					System.out.println("A customer with a chest measurement of " + chestSize + " " + "inches needs to order a size M.");
					
					
				}  else if (chestSize >= 40 && chestSize < 43) { // If chestSize is greater than or equal to 40 inches and less than 43 inches.
	
					// If it is true, print the appropriate shirt size (L).
					System.out.println("A customer with a chest measurement of " + chestSize + " " + "inches needs to order a size L.");
							
	            } else if (chestSize >= 43 && chestSize < 46) { // If chestSize is greater than or equal to 43 inches and less than 46 inches.
					
	            	// If it is true, print the appropriate shirt size (XL)
					System.out.println("A customer with a chest measurement of " + chestSize + " " + "inches needs to order a size XL.");
							
	            } else {
	            	
				  // Else print the appropriate shirt size (XXL) since none of the above conditions are true.
	              System.out.println("A customer with a chest measurement of " + chestSize + " " + "inches needs to order a size XXL.");
					
	            
				}
			
				
		 in.close();
		
	} // end of main()
	
} // end of class ShirtSize
