package week5;

import java.util.Scanner; //Import the Scanner class

public class InputValidationInteger {

	public static void main(String[] args) {
		
		
			// Using Scanner for getting Input from user
			Scanner in = new Scanner(System.in); // Create a Scanner Object
			
			// Declaring variables
			String input = "";
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			boolean valid = false;
			
			do {
				
				// Prompt the user to enter a number
				System.out.println("Please enter a number: ");
				
				// Using in.nextLine() to get the input from the user
				   input = in.nextLine();
				
				   try {
					   
					   // Convert the user input into an integer
					   // and store it in num1
					   num1 = Integer.parseInt(input);
					   
					   // If the parseIn() statement ran smoothly
					   // then set valid = true
					   valid = true; // This will make the program exit the do-while loop
					   
				   } catch(Exception e) {
					   
					   // Prompt the user to correct the number which gives error
					   System.out.println("Invalid Response! Please enter a whole number." + "\n");
					   
				   } // End of Try-Catch
				
			} while(!valid); // the valid = true will exit this do-while loop
				
			
			// Outside the do-while loop, do the following calculations:
			num2 = num1 + 1000;
			num3 = num1 * 2;
			
			// Print out num1
			System.out.println("num1 = " + num1);
			
			// Print out num2
			System.out.println("num2 = " + num2);
			
			// Print out num3
			System.out.println("num3 = " + num3);
			
			
			in.close();  // Close Scanner input
			
		} // End of main()
		

} // End of class InputValidationInteger
