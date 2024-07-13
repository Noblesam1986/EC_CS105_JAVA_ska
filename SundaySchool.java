package week4;

import java.util.Scanner;

public class SundaySchool {

public static void main(String[] args) {
		
		// Using Scanner for getting Input from user
				Scanner in = new Scanner(System.in);
				
				
				// Using in.nextLine()
				// String input = in.nextLine();
				
				
				// Asks a user to input the age of the member
				System.out.println("Please enter the member's age:");
				
				// Age is store as an integer 
				int age = Integer.parseInt(in.nextLine());
				
				if (age < 1) {
					
					// If age is less than one, Gender is NA and Result is Babe in Arms
					System.out.println("The member is a Babe in Arms.");
					
				} else if(age >= 1 && age < 3) {
					
					// If age is greater than or equal to 1 and less than 3
					System.out.println("The member should be in Nursery.");
					
				} else if(age >= 3 && age < 12) {
					
					// If age is greater than or equal to 3 and less than 12
					System.out.println("The member should attend Primary.");
					
				} else if(age >= 12 && age < 18) {
					
						// If age is greater than or equal to 12 and less 18
						// The member should either attend Young Men's Class or Young women's Class
					
					    // Ask user to input the member's gender, male or female
					    System.out.println("Please enter the member's gender:");
					    
					    // Store the input as gender
					    String gender = in.nextLine();
					
						if(gender.equalsIgnoreCase("Male")) {  // Ignore Case means that whether the input is in small letter or capital letter, 
							                                   //it should only compare the letters of the word to "Male"
							// If it is true
							System.out.println("The member should attend Young Men.");
							
						} else if(gender.equalsIgnoreCase("M")) {
							
							// If it is true
							System.out.println("The member should attend Young Men.");
							
						} else {
							
							// Else, the member is young female and should attend Young Women class
							System.out.println("The member should attend Young Women.");
							
						}
					
				} else {
					 
					// If all the conditions above are not met then the member is an adult, 18+
					// He or she should attend either Elder's Quorum or Relief Society respectively
					
					// Ask user to input the member's gender, male or female
				    System.out.println("Please enter the member's gender:");
					
				    // Store the input as gender
				    String gender = in.nextLine();
				
					if(gender.equalsIgnoreCase("Male")) {  // Java does not use "=="
														   // Ignore Case means that whether the input is in small letter or capital letter, 
						                                   //it should only compare the letters of the word to "Male"
						// If it is true
						System.out.println("The member should attend Elder's Quorum.");
						
					} else if(gender.equalsIgnoreCase("M")) {
						
						// If it is true
						System.out.println("The member should attend Elder's Quorum.");
						
					} else {
						
						// Else, the member is a female adult and should attend Relief Society class
						System.out.println("The member should attend Relief Society.");
						
					}
					
				}
				
				
				
			 in.close();
			
		} // end of main()
	
	
} // End of class SundaySchool
