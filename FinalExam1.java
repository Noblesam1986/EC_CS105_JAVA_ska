/*
 * Program: Final Exam 1
 * Name: Samuel Kofi Amissah
 * Date: 05/10/2023
 * Description: Strings
 */

 // NB: Examination Package
 // package Final;
package week14;
 
 import java.util.*;

 
public class FinalExam1 {
	public static void main(String[] args) {
		
		// Output to screen must follow exact format
		
		// Creating Scanner Input Object
		Scanner userInputObject = new Scanner(System.in);
		
		// Please enter your name:
		System.out.println("Please enter your name: ");
		
		// Accept input from user
		String usernameInput = userInputObject.next();
		
		// Please enter the name of your Ward:
		System.out.println("Please enter the name of your Ward: ");
		
		// Accept input from user
		String userWardInput = userInputObject.next()
		
		// Use input validation
		boolean choiceOne = false;
		do{
			
			// Please enter the approximate number of adult males in the ward:
			System.out.println("Please enter the approximate number of adult males in the ward: ");
			
			String userNumWardAdultMales = userInputObject.next();
			
			try{
				
				
				// Parsing string to integer
				Integer parseUserNumWardAdultMales = Integer.parseInt(userNumWardAdultMales);
				
				// If user input is a whole number
				choiceOne = true;
				
			} catch(Exception e){
				
				// If the input is not an integer
				// e.printStackTrace();
				System.out.println("Please enter a whole number.");
				
				
			}
			
			
			
		} while(!choiceOne);
		
		
		
		// Use input validation
		boolean choiceTwo = false;
		do{
			
			// Please enter the approximate number of adult females in the ward:
			System.out.println("Please enter the approximate number of adult females in the ward: ");
			
			String userNumWardAdultFemales = userInputObject.next();
			
			try{
				
				
				// Parsing string to integer
				Integer parseUserNumWardAdultFemale = Integer.parseInt(userNumWardAdultFemales);
				
				// If user input is a whole number
				choiceTwo = true;
				
			} catch(Exception e){
				
				// If the input is not an integer
				// e.printStackTrace();
				System.out.println("Please enter a whole number.");
				
				
			}
			
			
			
		} while(!choiceTwo);
		
		
		
		
		
		// Then print out the following sentence.

		// There are <males + females> adult members in <name>'s <ward name> ward.
		
		// Total of Males and Female
		int adultMalesFemalesTotal = parseUserNumWardAdultMales + parseUserNumWardAdultFemale;
		
		System.out.println("There are " + adultMalesFemalesTotal + "in " + usernameInput + "'s" + " " + userWardInput + ".");
		
		
		
	}//end of main()
	
	
}//end of class FinalExam1
