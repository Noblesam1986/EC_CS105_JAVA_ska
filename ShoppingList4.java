package week12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * The starter code to an application that a user can use for a shopping list.
 * This provides simple operations like add, delete, show, sort, and exit.
 * 
 * @author Samuel Kofi Amissah
 *
 *
 */

public class ShoppingList4 {

	


	/**
	 * main() method displays a menu to the user and asks them to select a command.
	 * The method will continue to display the menu to the user until they wish to
	 * quit by selecting 'Exit' from the menu.
	 * <p>
	 * The method also creates a new, empty shoppingList of type ArrayList<String>
	 * Based on the user input, the appropriate method will be called to perform
	 * actions on the shoppingList.
	 * <p>
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
	 */
	public static void main(String[] args) {
		// Initialize variables
		Scanner sIn = new Scanner(System.in); // Input Scanner for String
		ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
		String choice; // Holds user input of type String
		
		// Saving a file's name as List.txt and assigning it to a variable called fileName
		String fileName = "List.txt";
		
		boolean done = false; // Keeps program running until user wants to quit
		// Keep running the program until the user quits
		do {
			// Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Save List");
			System.out.println("6. Open List");
			System.out.println("7. Exit");
			System.out.print("Please enter a command: ");
			choice = sIn.nextLine();

			// Call the appropriate method for the choice selected.
			switch (choice) {
			case "1": // Add items to the Shopping List
				System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
				break;
			case "2": // Delete items from the Shopping List
				System.out
						.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
				break;
			case "3": // Show the items in the Shopping List
				showItems(shoppingList);
				break;
			case "4": // Sort the items in the Shopping List
				sortItems(shoppingList);
				break;
			case "5": // Sort the items in the Shopping List
				saveList(sIn, shoppingList,fileName);
				break;
			case "6": // Sort the items in the Shopping List
				openList(sIn, shoppingList,fileName);
				break;
			case "7": // Exit the program
				System.out.println();
				System.out.println("Goodbye");
				done = true;
				break;
			default: // Handles all input that is not between 1-5
				System.out.println("Invalid response. Please enter a choice from the menu (1-7).");
			} // End of switch (choice)
		} while (!done); // Keep running the program until the user quits

		sIn.close();
	}// end of main()

	//////////////////////////////////////////////
	// STUDENTS, FILL IN THE METHOD STUBS BELOW://
	// addItems() //
	// deleteItems() //
	// showItems() //
	// sortItems() //
	//////////////////////////////////////////////

	/**
	 * Asks the user to enter an item to be stored in the shoppingList and then adds
	 * the item to the shoppingList ArrayList. The user may enter as many items as
	 * they want, hitting ENTER to stop entering items and return to main(). Each
	 * time the user enters an item into the list, a message will be displayed
	 * showing the item entered in the following format:
	 * <p>
	 * 'item' has been added to the Shopping List.
	 * <p>
	 * Example -- 'Eggs' has been added to the Shopping List.
	 * <p>
	 * Returns the number of items added to the shoppingList
	 * 
	 * @param sIn          - The scanner to allow to get user input from the console
	 * @param shoppingList - The array list to store the items of the shopping list
	 * @return - the number of items added to the shopping list
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
		// FIXME: implement the method
		
		// The number of elements in the shoppingList ArrayList
	    int numItems = shoppingList.size();
		
		
			    boolean stopAddingElements = false;
			    do {
			    	
			    	// Asks the user to enter numbers into an ArrayList
			    	System.out.print("Add an item to the list (or just hit 'ENTER' when done): ");
			    	// User input is an integer
			    	
			    	
					    	try { // Validate that each number is an integer
					    		
					    		
									    			
						    		// Accept input as a string
						    		String inputRaw = sIn.nextLine();
									    			
									    		
									    	if(inputRaw.isEmpty()) {
									    		
									    			// When user presses enter without pressing a number
									    		    
									    		    // Test
									    		    // System.out.println(shoppingList);
									    		    
									    		    // Break out of the loop
									    		    stopAddingElements = true;
									    		    
										    		
								    		
									    	} else {
									    		  	
									    			// Verify input if it is an integer
									    			
									    		
										    		// Checking the input if it contains :
										    		if(inputRaw.contains(":")){  
									    			
											    			// Continue process
												            
											    			// Separate item and quantity
											    			int colonIndex = inputRaw.indexOf(":");
											    			
											    			String itemName = inputRaw.substring(0, colonIndex);
											    			String itemQuantity = inputRaw.substring(colonIndex + 1);
											    		    
											    			// Trim the item and also trim the quantity
											    			String trimmedItemName = itemName.trim();
											    			String trimmedItemQuality = itemQuantity.trim();
											    			
											    			// Put the trimmed item and the trimmed quantity together with : in the middle
											    			String saveTrimmedItemQuality = trimmedItemName + ":" + trimmedItemQuality;
												            
												            // Add an item and quantity to shoppingList ArrayList
											    		    shoppingList.add(saveTrimmedItemQuality);
												            
												            // Output
											    		    System.out.println("'" + saveTrimmedItemQuality + "'" + " has been added to the Shopping List.\n");
												    		
										    		} else {
												    			
												    			// Output a message to the user for entering wrong formatted input
												    			System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'\n");
												    		
												    		} 
									    		    
									    		    
									    	}
									    	
									    
									    		
									    		
						    	} catch(Exception e) {
						    		
						    		// When validating an input if it is an integer
						    		// If input is not an integer, it throws exception
						    		// Ask user to enter an integer
						    		// System.out.println("Invalid response. Please enter a whole number.");
						    				    		
						    	}
							    	
							    	
				    } while(!stopAddingElements);
		 
			    
				     // Numbers of elements after adding more elements
				     int newNumItems = shoppingList.size();
						    
				     // Number of elements newly added
				     int numItemsAdded = newNumItems - numItems;
					
					// Return the number of items in the shoppingList ArrayList
					return numItemsAdded;
        
		
	}// end of method addItems(ArrayList<String>)
	

	/**
	 * Asks the user to enter an item to be deleted from the shoppingList and then
	 * deletes the item from the shoppingList ArrayList. The user may delete as many
	 * items as they want, hitting ENTER to stop deleting items and return to
	 * main(). Each time the user deletes an item from the list, a message will be
	 * displayed showing the item deleted in the following format:
	 * <p>
	 * 'item' has been deleted from the Shopping List.
	 * <p>
	 * Example -- 'Peaches' has been deleted from the Shopping List.
	 * <p>
	 * If the user tries to delete an item not in the list, a message will be
	 * displayed indicating the error and showItems() will be called. Returns the
	 * number of items deleted from the shoppingList
	 * 
	 * @param sIn          - The scanner to allow to get user input from the console
	 * @param shoppingList - The array list to store the items of the shopping list
	 * @return - the number of items deleted from the shopping list
	 */
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		// FIXME: implement the method
		
		
		// The number of elements in the shoppingList ArrayList
	    int numItems = shoppingList.size();
				   
				
					    boolean stopDeletingElements = false;
					    do {
					    	
					    	// Asks the user to enter numbers into an ArrayList
					    	System.out.println("Delete an item from the list (or just hit 'ENTER' when done): ");
					    	// User input is an integer
					    	
					    	
							    	try { // Validate that each number is an integer
							    		
							    		// Accept input as a string
							    		String inputRaw = sIn.nextLine();
							    			
							    		
							    		
								    	if(inputRaw.isEmpty()) {
								    		
								    		// When user presses enter without pressing a number
							    		
							    		    // Test
							    		    // System.out.println(shoppingList);
							    		    
							    		    // Break out of the loop
								    		stopDeletingElements = true;
								    		    
									    		
							    		
								    	} else {
								    		  	
								    			// Verify input
									            
									            
									            // Delete an element of the shoppingList ArrayList			  
								    		    
								    		    // Is the item you want to delete contained in the shoppingList ArrayList?
								    		    if(shoppingList.contains(inputRaw)) { //If it is contained in the ArrayList
								    		    	
								    		    	// Finding the Index of item in the ArrayList
								    		    	int indexToDelete = shoppingList.indexOf(inputRaw);
								    		    	
								    		        // Deleting the item or element in the ArrayList	
								    		    	shoppingList.remove(indexToDelete);
								    		    	
								    		    	// Output
									    		    System.out.println("'" + inputRaw + "'" + " has been deleted from the Shopping List.\n");
								    		    	
									    		    // Break out of the loop
										    		// stopDeletingElements = true;
								    		    	
								    		    } else {
								    		    	
								    		    	// The item is not an element or contained in the ArrayList, shoppingList
								    		    	System.out.println("Invalid Response! " + inputRaw + " is NOT an item in the list. \n");
								    		    	
								    		    	// Output
								    		    	System.out.println("The Shopping List contains the following items: ");
								    		    	System.out.println(shoppingList + "\n");
								    		    	
								    		    	
								    		    	// Break out of the loop
										    		// stopDeletingElements = true;
								    		    		
								    		    	
								    		    }
								   
									    		
								    	}
							    		
							    		
							    	} catch(Exception e) {
							    		
							    		// When validating an input if it is an integer
							    		// If input is not an integer, it throws exception
							    		// Ask user to enter an integer
							    		// System.out.println("Invalid response. Please enter a whole number.");
							    				    		
							    	}
				    	    
					    	
					    	
					    } while(!stopDeletingElements);
					    
					    
				
					 // Numbers of elements after latest elements deletion
					     int newNumItems = shoppingList.size();
							    
					     // Number of elements newly deleted
					     int numItemsDeleted = numItems - newNumItems;
						
						// Return the number of items in the shoppingList ArrayList
						return numItemsDeleted;
		
		
	}// end of method deleteItems(ArrayList<String>)

	/**
	 * Simply displays the contents of the shoppingList ArrayList in it's simplest
	 * form. <br>
	 * Example --
	 * <p>
	 * The Shopping List contains the following items: <br>
	 * [item-1, item-2, item-n]
	 * <p>
	 * 
	 * @param shoppingList - The ArrayList that stores the shopping list
	 */
	public static void showItems(ArrayList<String> shoppingList) {
		
		// FIXME: implement the method
		
		// Output
		
		System.out.println("\n--------------------\n");
		System.out.printf("   Shopping List \n");
		System.out.println("\n--------------------");
		
		
		for(int n = 0; n < shoppingList.size(); n++) {
			
			// Get each element in the ArrayList, shoppingList
			String eachElement = shoppingList.get(n);
			
			// Get the words before and after the colon : of each element in shoppingList ArrayList
			
			// Separate item and quantity
			
			// Find the index of the colon :
			int colonIndex = eachElement.indexOf(":");
			
			// Finding the word before the colon, : of an element in the shoppingList
			String itemName = eachElement.substring(0, colonIndex);
			
			// Finding the word after the colon, : of an element in the shoppingList
			String itemQuantity = eachElement.substring(colonIndex + 1);
			
			// Using the print function
			System.out.printf("%-15s %-8s %n", itemName, itemQuantity);
			
			
			
			// Test
			//System.out.println(eachElement + "\n");
			
		}
	
	    
	    System.out.println("--------------------\n");
		
		
		
	}// end of method showItems(ArrayList<String>)

	/**
	 * Sorts the items in the shoppingList ArrayList, then calls showItems() to
	 * display the sorted list. Example --
	 * <p>
	 * The Shopping List contains the following items: <br>
	 * [item-1, item-2, item-n]
	 * <p>
	 * 
	 * @param shoppingList - The ArrayList that stores the shopping list
	 */
	public static void sortItems(ArrayList<String> shoppingList) {
		// FIXME: implement the method
		
		// Output
		System.out.println("The Shopping List has been sorted. \n");
		
		// Sorting ArrayList in ascending Order   
		Collections.sort(shoppingList);   
		
		// Output
		
					System.out.println("\n--------------------\n");
					System.out.printf("   Shopping List \n");
					System.out.println("\n--------------------");
					
					
					for(int m = 0; m < shoppingList.size(); m++) {
						
						// Get each element in the ArrayList, shoppingList
						String eachElement = shoppingList.get(m);
						
						// Get the words before and after the colon : of each element in shoppingList ArrayList
						
						// Separate item and quantity
						
						// Find the index of the colon :
		    			int colonIndex = eachElement.indexOf(":");
		    			
		    			// Finding the word before the colon, : of an element in the shoppingList
		    			String itemName = eachElement.substring(0, colonIndex);
		    			
		    			// Finding the word after the colon, : of an element in the shoppingList
		    			String itemQuantity = eachElement.substring(colonIndex + 1);
						
						// Using the print function
		    			System.out.printf("%-15s %-8s %n", itemName, itemQuantity);
		    			
		    			
		    			
		    			// Test
						//System.out.println(eachElement + "\n");
						
					}
				
				    
				    System.out.println("--------------------\n");   
		
		
	}// end of method sortItems(ArrayList<String>)
	
	
	// The saveList Method
	// Accepts a Scanner object to get input from the user
	// The shoppingList ArrayList as argument
	// The FILENAME where the shopping list will be written to as arguments
	public static void saveList(Scanner sIn, ArrayList<String> shoppingList, String FILENAME) {
		
		boolean overwrite = false;
		
		if(shoppingList.size() != 0) {
			
			boolean valid = false;
			do {
				
				// Prompt user to accept to overwrite the new shopping list over the old saved shopping list on the file, List.txt
				System.out.print("Are you sure you wish to overwrite the 'Shopping " + FILENAME + "' file with your current list? (Y/N): ");
				
				// Accept input from user
				String userInput = sIn.nextLine();
				
				// When user input y or Y (Yes)
				if(userInput.equalsIgnoreCase("Y")) {
					
					overwrite = true;
					valid = true;
				
				// When user input n or N (No)
				} else if(userInput.equalsIgnoreCase("N")) {
					
					overwrite = false;
					valid = true;
					
				} else {
					
					System.out.println("\n Error: Please answer with a 'Y' or 'N'");
					
				} 
				
				
			} while(!valid);
			
			
		}
		
		
		// When the user wants the new shopping list to be overwritten to the file, List.txt
		if(overwrite) {
			
			PrintWriter writer = null;
			
			try {
				
					// Create a PrintWriter object
					writer = new PrintWriter(FILENAME);
					
					// Write or overwrite to the file, List.txt
					// NB: This also creates the file when the file does not exist
					// writer.println(shoppingList);
					
					// Output
					
					// writer.println("\n--------------------\n");
					// writer.printf("   Shopping List \n");
					// writer.println("\n--------------------");
					
					
					for(int m = 0; m < shoppingList.size(); m++) {
						
						// Get each element in the ArrayList, shoppingList
						String eachElement = shoppingList.get(m);
						
						// Get the words before and after the colon : of each element in shoppingList ArrayList
						
						// Separate item and quantity
						
						// Find the index of the colon :
		    			// int colonIndex = eachElement.indexOf(":");
		    			
		    			// Finding the word before the colon, : of an element in the shoppingList
		    			// String itemName = eachElement.substring(0, colonIndex);
		    			
		    			// Finding the word after the colon, : of an element in the shoppingList
		    			// String itemQuantity = eachElement.substring(colonIndex + 1);
						
						// Using the print function
		    			// writer.printf("%-15s %-8s %n", itemName, itemQuantity);
		    			
		    			
		    			
		    			//
						// writer.println(eachElement + "\n");
						writer.println(eachElement);
						
					}
				
				    
				    // writer.println("--------------------\n"); 
					
					
					
					
					// Shopping List saved to file: Shopping List.txt. 
					// NB: The list, List.txt is saved in the project folder, JavaBasic
					System.out.println("Shopping List saved to file: Shopping " + FILENAME + ".");
				
				
			} catch(FileNotFoundException e) {
				
					e.printStackTrace();
				
			}
			
			writer.close();
			
		} else {
			
			// Shopping List not saved.
			System.out.println("\nShopping List not saved.");
			
		}
		
		
	}
	
	
	
	
		// The openList Method
		// Accepts a Scanner object to get input from the user
		// The shoppingList ArrayList as argument
		// The FILENAME where the shopping list will be written to as arguments
		public static void openList(Scanner sIn, ArrayList<String> shoppingList, String FILENAME) {
			
			
			
			boolean overwrite = false;	 
					 
					boolean valid = false;
					do {
						
						// Prompt user to accept to overwrite the new shopping list over the old saved shopping list on the file, List.txt
						System.out.print("Are you sure you wish to overwrite your current shopping list with the 'Shopping " + FILENAME + "' file? (Y/N): ");
						
						// Accept input from user
						String userInput = sIn.nextLine();
						
						// When user input y or Y (Yes)
						if(userInput.equalsIgnoreCase("Y")) {
							
							overwrite = true;
							valid = true;
						
						// When user input n or N (No)
						} else if(userInput.equalsIgnoreCase("N")) {
							
							overwrite = false;
							valid = true;
							
						} else {
							
							System.out.println("Invalid response. Please answer with a 'Y' or 'N'\n");
							overwrite = false;
							valid = false;
							
						} 
						
						
					} while(!valid);
				
				
				 
			
			
				// When the user wants the new shopping list to be overwritten to the file, List.txt
				if(overwrite) {
					
					ArrayList<String> loadedShoppingList = loadDataFromFile(FILENAME);
					
					// Test
					// System.out.println(loadedShoppingList);
					
					try {
						
							// Update the shoppingList ArrayList with the content from the retrieved file content
							
							// Clear the content on the shopppingList ArrayList
							shoppingList.clear();
						
							for(int m = 0; m < loadedShoppingList.size(); m++) {
								
								// Get each element from the retrieved content of the file to the shoppList ArrayList
								String eachElement = loadedShoppingList.get(m);
								
								// Add each element from the loadedshoppingList ArrayList to the ArrayList, shoppingList
								shoppingList.add(eachElement);
								
								
							}
							
							
							// Shopping List saved to file: Shopping List.txt. 
							// NB: The list, List.txt is saved in the project folder, JavaBasic
							
							if(loadedShoppingList.size() != 0) {
								
								System.out.println("Shopping List overwritten from file: Shopping " + FILENAME + ".");
							
							}
						
					} catch(Exception e) {
						
							e.printStackTrace();
						
					}
					
				
					
				 } else {
					
					// Shopping List not saved.
					System.out.println("Shopping List not opened.");
					
				}
			
				
		} // End of method, openList
		
		
		
		
		// Creating a method which copies the text on a file line by line, formats each line and store each formated line to an ArrayList (which serves as a multidimensional ArrayList
		
		// With the ReturnType as an ArrayList containing Array Strings
		// public static ArrayList<String[]> loadDataFromFile(String name){
		
		// With the ReturnType as an ArrayList containing Strings
		public static ArrayList<String> loadDataFromFile(String name){
			
			// The Scanner object, scanObjec is going to take a new file
			Scanner scanObjec = null;
			
			// Creating an ArrayList object (containing String Arrays)
			// ArrayList<String[]> data = new ArrayList<String[]>();
			
			// Creating an ArrayList object (containing Strings)
			ArrayList<String> data = new ArrayList<String>();
			
			// Creating a method
			try { // Checking if the file exist
		    	
		    	
		    	
		    	// Creating a Scanner object with the File object
		    	// This will also check if the file exist
		    	scanObjec = new Scanner(new File(name)); 
		    	
		    	
		    	// Printing the header of the columns names
		    	
		    	// Skip the first line or the header on the file, Student Assignment since we have already created a header
		    	// scanObjec.nextLine();
		    	
		    	
		    	// Output the string content on the file, Student Assignment Scores.csv 
		    	// Using while loop
		    	while(scanObjec.hasNextLine()) { // Checking if each line of the file in the scanner object has text 
		    		
		    		// Saving each line of text as an Array String
		    		// Separating the words in each line's text or String Array using comma "," 
		    		// NOTE: On the file, Student Assignment Scores.csv, the text in each line is separated by a comma
		    		// String[] formatedStudentAssignments = scanObjec.nextLine().split(",");
		    		
		    		// Saving each line of text as a String
		    		String eachLineText = scanObjec.nextLine();
		    		
		    		// Add each formated text on each line on the file to the ArrayList, inquiryStudentScore
		    		data.add(eachLineText);
		    		
		    	}
		    	
		    
		    	
		    	
		    } catch (Exception e) { // Catching errors
		    	
		    	// e.printStackTrace();
		    	
		    	System.out.println("\nFile Error: File 'Shopping List.txt' not found! Please save the list before trying to open it.");
		      
		    } finally{
		    	
		    	if(scanObjec != null) { // When the scanner object, scanObjec is not null
		    		
		    		// Close the scanner object, scanObjec
		    		scanObjec.close();
		    	}
		    }
			
			
				return data;
				
			}

	
	

}
