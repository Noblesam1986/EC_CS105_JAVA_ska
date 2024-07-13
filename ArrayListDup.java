package week8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDup {
	
	
	 // Creating the dub() method with ArrayList argument
	// The method is taking an ArrayList as argument and the returnType is also an ArrayList
    public static ArrayList<Integer> dups(ArrayList<Integer> userInput1) {
    	
    	//Test
    	//System.out.println(userInput1);
    	//System.out.println(userInput1.size());
    	
    	// Creating an ArrayList without duplicate elements
    	// ArrayList object is created for user inputs
    	ArrayList<Integer> cleanUserInput = new ArrayList<Integer>();
    	
    	// Creating another ArrayList to store elements which are duplicated called dupElements
    	// Define the object of ArrayList, dupElements
    	ArrayList<Integer> dupElements = new ArrayList<Integer>();
    	
    	
	    // Condition to add elements to the new ArrayList without duplicates, cleanUserInput
	    for(int m = 0; m < userInput1.size(); m++ ) {
	    	
	    	//Test
	    	//System.out.println(m);
	    	
	    	// Get each element in the ArrayList, userInput1, the same ArrayList sent by the main method
	    	int getEachElement = userInput1.get(m);
	    	
	    	//Test
	    	//System.out.println(userInput1.get(m));
	    	//System.out.println(!cleanUserInput.contains(getEachElement));
	    	
	    	
		    	// Using not contain()to store the elements without duplicates in the new ArrayList, cleanUserInput with add()
		    	// If element is contained, use add() to store element in dupElements and skip adding it to the cleanUserInput
		    	if(!cleanUserInput.contains(getEachElement)) { // If element is not contained in cleanUserInput, add it to it.
		    		
		    		// Add element from the ArrayList sent from the main method without duplication, userInput1(name here) or userInput(name in main)
			    	cleanUserInput.add(getEachElement);
		    		
		    	} 
		    	else if(!dupElements.contains(getEachElement)){ // If element is already in cleanUserInput and it is not stored in dupElements add.
		    		
		    		// If element already exist in the ArrayList without duplicates, cleanUserInput
			    	dupElements.add(getEachElement);	
		    		
		    	} else {
		    		
		    		//
		    		
		    	}
	    	
	     } // End of for loop
	    
	    	
	    	// The ArrayList with duplicated elements should be displayed or also returned to the main method
	    	// System.out.println("The following numbers were duplicated in the ArrayList: " + dupElements);
    		
    		//return addInput;
	        return dupElements;
    		
    	}

	
    // Creating the sumValue method with ArrayList argument
    public static int sumValue(ArrayList<Integer> userInput2) {
    	// Test
		  
	    // sumValues() method
	    int addInput2 = 0;
	    int addElements = 0;
	    
	    for(int n = 0; n < userInput2.size(); n++ ) {
	    	
	    	// Get each element in the ArrayList, userInput2, the same ArrayList sent by the main method
	    	addElements = userInput2.get(n);
	    	
	    	// Add each element in the ArrayList
	    	addInput2 = addInput2 + addElements;
	    	
	     }
    		
    		return addInput2;
    		
    	}
    		
    		

// Main method
public static void main(String[] args) {

// Creating scanner object in
Scanner in = new Scanner(System.in); 

// Introduction to the program
System.out.println("\n" + "\nThis program will ask the user to enter a series of numbers.\r\n"
		+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\r\n"
		+ "The program will then display the array of numbers and the sum total of those numbers. \n");

// ArrayList object is created for user inputs
ArrayList<Integer> userInput = new ArrayList<Integer>();

// ArrayList object is created for user inputs index
ArrayList<Integer> userInputIndex = new ArrayList<Integer>();

// User input is an integer
for(int i=0; i < 1000 ; i++) {

	    // Validate that each number is an integer
	    boolean ValidInt = false;
	    do {
	    	
	    	// Asks the user to enter numbers into an ArrayList
	    	System.out.println("Please enter a number (or just hit enter to finish):");
	    	// User input is an integer
	    	
	    	
			    	try {
			    		
			    		// Accept input as a string
			    		String inputRaw = in.nextLine();
			    			
			    		
			    		
				    	if(inputRaw.isEmpty()) {
				    		
				    			// When user inputs 'enter' on the keyboard
				    		    // System.out.println("You have pressed enter.");
				    		    
					    		
				    		    // Calling the dups() method to adds up all the numbers
				    		    ArrayList<Integer>dupCheckedInputs = dups(userInput);
				    		    
				    		 
				    		    // Calling method sumValue() to adds up all the numbers
				    		    int addtionInputs = sumValue(userInput);
				    		    
				    		    
				    		    // Indices ArrayList of the ArrayList without duplicates, dupCheckedInputs
				    		    for(int r = 0; r < userInput.size(); r++) {
				    		    	
				    		    	
					    		    // Add user inputs indices into an ArrayList called userInputIndex
						    		userInputIndex.add(r);
						    		
				    		    	
				    		    }
				    		    
					    		
					    		// OUTPUT
					    		
					    		// Output indices of elements of the ArrayList without duplicate elements
				    		    System.out.println("Index: " + userInputIndex);
				    		    
				    		    
				    		    // Output ArrayList without duplicate elements
				    		    System.out.println("Item: " + userInput);
				    		    
				    		    // 
				    		    System.out.println("There are " + userInput.size() + " items in the ArrayList.");
				    		    
					    	    // Using main() to print how many elements are there in the ArrayList
				    		   System.out.println("The sum total of numbers in the ArrayList is " + addtionInputs + ".");
				    		   
				    		   // Sort the ArrayList dupCheckedInputs to arrange the inputs from smaller to bigger
				    		   Collections.sort(dupCheckedInputs);
				    		   
				    		// The ArrayList with duplicated elements should be displayed or also returned to the main method
				   	    	System.out.println("The following numbers were duplicated in the ArrayList: " + dupCheckedInputs);
				    		    
						    	
						    	// Exit Loop
						    	break;
						    	
			    		
				    	} else {
				    		  	
				    			// Test if input is an integer
					    		int inputValid = Integer.parseInt(inputRaw);	
				    			
					    		// Add user inputs into the ArrayList called userInput
					    		userInput.add(inputValid);
					    	
					    		
				    	}
			    		
			    		
			    	} catch(Exception e) {
			    		
			    		// If input is not an integer, it throws exception
			    		// Ask user to enter an integer
			    		System.out.println("Invalid response. Please enter a whole number.");
			    		
			    		// The do while loop will loop again
			    		
			    	}
    	    
	    	
	    	
	    	
	    	
	    } while(!ValidInt);
	    
	    
	    
	    //PLAN AGAIN
	    // Ask user if he or she wants to play again
			System.out.println("\n" + "Do you wish to play again? (Y/N): " + "\n\n");
			
   			// Declaring variables
				String input = "";
				
				boolean valid = false;
				
				do {
					
					// Using in.nextLine() to get the input from the user
					   input = in.nextLine();
					   
						   if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N") ) {  // If the user input is Y or y meaning yes
							   
							   			if(input.equalsIgnoreCase("Y")) {
							   				
							   				// Clear Elements in the ArrayList
							   				userInput.clear();
							   				
							   			    // Clear Elements in the ArrayList
							   				userInputIndex.clear();
							   				
							   				// Counter
							   				i = 0;
							   				
							   				
							   				// User likes to play again
							   				break;
							   				
							   			} else if(input.equalsIgnoreCase("N") ) {
							   					
							   			    // User does not want to play again.
							   				// System.out.println("bye.");
							   				System.exit(0);
							   			
							   			}
							  
							
							
							}  else {
								
									// Output: Invalid Response! Please answer with a 'Y' or 'N'. 
									System.out.println("Invalid Response! Please answer with a 'Y' or 'N'." + "\n");
								 
							   	
						            }
					   
					
					} while(!valid); // PLAY AGAIN LOOP ENDS
	    
	    
	    
	    
		} // for loop ends here


}

	
	
	

}
