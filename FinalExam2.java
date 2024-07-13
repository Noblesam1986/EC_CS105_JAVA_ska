/*
 * Program: Final Exam 2
 * Name: Samuel Kof Amissah
 * Date: 05/04/2023
 * Description: Arrays and Functions
 */

// Original Final Exams Package
// package Final;
package week14;

import java.util.*;

public class FinalExam2 {

	public static void main(String[] args) {
		
			// Use an ArrayList<Integer> to store these numbers. 
			// The user should be able to enter as many numbers as they want. 
			
			// Creating an inter ArrayList 
			ArrayList<integer> savingArrayList = new ArrayList<integer>();
			
			// Creating a Scanner Object
			Scanner userIntInputObject = new Scanner(System.in);
			
			boolean userdone = false;
			do{
				// Ask User to enter integers an many as he or she wants
				// No input validation
				System.out.println("Please enter a number (or just hit enter to finish): ");
				
			
					// Accept the integers or numbers from user
					String userInterInput = userIntInputObject.nextLine();
					
					// No validation
					// Parse user input String into integer
					Integer userIntInput = Integer.parseInt(userInterInput);
					
				if(String userInterInput.isEmpty()){ // User pressed enter
					
					// User has finished entering numbers or integers



				} else{ // User has not pressed enter
					
					// Continue adding
					savingArrayList.add(userIntInput);
					
					
					// You will pass the ArrayList of numbers to each method 
					// and each method must return the result back to main().
					
					// Send the ArrayList of user input to the addNumbers Method to sum of user integers
					int sumOfUserIntegers = addNumbers(savingArrayList);
					
					// Send the ArrayList of user input to largestOfUserInput Method to obtain the largest number
					int largestOfUserInput = largestNumber(savingArrayList);
					
					
					// Output Sum
					System.out.println("The sum of the list of numbers is :" + sumOfUserIntegers);
					
					// Output Largest Number
					System.out.println("The largest number in the list is: " + largestOfUserInput);
					
					
				}
					
					// The user will indicate they are done entering numbers 
					// by hitting the enter key without entering any data.
					
					
					
					 
					
					// addNumbers: This method accepts one argument of datatype ArrayList<Integer> and returns an int.  
					// It should add all the numbers in the array and return the total. 
			
			
			} while(!userdone);
			
			
	}//end of main()
	
	
	// Write two methods: addNumbers and largestNumber
	
	// addNumbers Method
	public static int addNumbers(ArrayList<String> userInputArrayList){
		
		int sum = 0;
		
		for(int m = 0; m < userInputArrayList.size(); m++){
			
			String takeEachUserInput = userInputArrayList.get(m);
			
			// Parse String to integer
			Integer eachInputFromUser = Integer.parseInt(takeEachUserInput);
			
			// Add the user integer or number
			sum += eachInputFromUser;
		
		}
		
		return sum; 
		
	}
	
	
	// largestNumber Method
	public static int largestNumber(ArrayList<String> userInputArrayList){
		
		Int largest = 0;
		
		for(int n = 0; n < userInputArrayList.size(); n++){
			
			String takeEachUserInput = userInputArrayList[n];
			
			// Parse String to integer
			Integer eachInputFromUser = Integer.parseInt(takeEachUserInput);
			
			int greater = 0;
			
			// If condition to select the largest number
			if(int greater < eachInputFromUser){
				
				// If the number greater is less than the input choose the input
				greater = eachInputFromUser;
				
			}
			
		
		}
		
		return greater; 
		
	}

	
}//end of class FinalExam2
