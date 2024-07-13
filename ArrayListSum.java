package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
	
	        // Creating a method for the 
	        public static int sumValue(ArrayList<Integer> userInput) {
	        	// Test
	    		  
    		    // sumValues() method
    		    int addInput = 0;
    		    int addElements = 0;
    		    
    		    for(int n = 0; n < userInput.size(); n++ ) {
    		    	
    		    	// System.out.println("\n" + "Counter j = " + n);
    		    	
    		    	addElements = userInput.get(n);
    		    	// System.out.println("Value of the " + n + "th" + " Element = " + addElements);
    		    	
    		    	addInput = addInput + addElements;
    		    	
    		    	// System.out.print("Total of Consecutive Elements: " + addInput + "\n");
    		    	
    		     }
	        		
	        		return addInput;
	        		
	        	}
	        		
	        		
	        	
			//}
	
	
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
			    int r = 0;
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
						    		    
							    		// Output ArrayList
						    		    System.out.println("Index: " + userInputIndex);
						    		
						    		    // Output ArrayList
						    		    System.out.println("Item: " + userInput);
						    		    
						    		 
						    		    // Creating method sumValue() to adds up all the numbers
						    		    int addtionInputs = sumValue(userInput);
						    		    
						    		    // 
						    		    System.out.println("There are " + userInput.size() + " items in the ArrayList.");
						    		    
							    	    // Using main() to print how many elements are there in the ArrayList
						    		   System.out.println("The sum total of numbers in the ArrayList is " + addtionInputs + ".");
						    		    
								    	
								    	// Exit Loop
								    	break;
								    	
					    		
						    	} else {
						    		  	
						    			// Test if input is an integer
							    		int inputValid = Integer.parseInt(inputRaw);	
						    			
							    		// Add user inputs into the ArrayList called userInput
							    		userInput.add(inputValid);
							    	   
							    	
							    		// Add user inputs index into another ArrayList called userInputIndex
							    		userInputIndex.add(r);
							    		
							    		r = r + 1;
							    	
							    		
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


