package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner; //Import the Scanner class

public class PasswordScanner {

	
	
	public static void main(String[] args) {
		
		// Beginning password analysis....
		System.out.println("Beginning password analysis....");
		
		// COPYING THE CONTENT OF THE FILE, pwd.txt INTO A STRING ARRAYLIST copiedPasswordData
		// Assigning the password file name as a string variable 'fileName'
		String fileName = "pwd.txt";
		
		// Test
		// System.out.println(fileName);
		
		// Assigning the name of the file that will contain the valid passwords as a string
		String fileNameValid = "validpwd.txt";
		// Assigning the name of the file that will contain the invalid passwords as a string
		String fileNameInvalid = "invalidpwd.txt";
		
		// Test
		// System.out.println(fileNameValid);
		// System.out.println(fileNameInvalid);
		
		
		// Creating an a File object
		File passwordFileObject = null;
		
		// Creating a Scanner Object of the file
		Scanner passwordFileScanObject = null;
		
		// Creating an ArrayList copiedPasswordData
		// The ArrayList
		// ArrayList<String> copiedPasswordData = new ArrayList<String>();
		
		// Creating an ArrayList containing the Special Characters that must be in each password
		ArrayList<String> specialCharaterList = new ArrayList<String>();
		
		// Creating an ArrayList for Valid passwords
		 ArrayList<String> validPasswords = new ArrayList<String>();
		
		// Creating an ArrayList for Invalid passwords
		 ArrayList<String> invalidPasswords = new ArrayList<String>();
		
		
		// Creating the files invalidpwd.txt and validpwd.txt if they do not exist and opens them for writing.
		
				PrintWriter writerInvalidpwd = null;
				PrintWriter writerValidpwd = null;
				
				try {
					
						// Create PrintWriter objects
						// NB: This also creates the file when the file does not exist
						writerInvalidpwd = new PrintWriter(fileNameInvalid);
						writerValidpwd = new PrintWriter(fileNameValid);
					
					
				} catch(FileNotFoundException e) {
					
						e.printStackTrace();
						
						// Creating files failed
						System.out.println("Files creation failed");
					
				}
		
		
		// CHECKING PASSWORD REQUIREMENTS
		// Evaluates each password in the list one at a time to see if each one meets all requirements.
				
				// Add the Special Characters to the Special Characters ArrayList specialCharacterList
				if(!specialCharaterList.contains("@")) {
					specialCharaterList.add("@");
				}
				if(!specialCharaterList.contains("#")) {
					specialCharaterList.add("#");
				}
				if(!specialCharaterList.contains("%")) {
					specialCharaterList.add("%");
				}
				if(!specialCharaterList.contains("-")) {
					specialCharaterList.add("-");
				}
				if(!specialCharaterList.contains("&")) {
					specialCharaterList.add("&");
				}
				if(!specialCharaterList.contains("*")) {
					specialCharaterList.add("*");
				}
				
				
				// Test
				// System.out.println("");
				// System.out.println(specialCharaterList);
		
		
		// Checks to see if the pwd.txt file exists in the current directory. If the file does not exist in the current directory, display an error message and stop the program.
		try { // Checking if the file exist
		    
			
			// Opening file 'Pwd.txt'.
			System.out.println("Opening file 'Pwd.txt'.");
		    	
			// Opens the pwd.txt file
			passwordFileObject = new File(fileName);
		
			// Creating a Scanner Object of the file
			passwordFileScanObject = new Scanner(passwordFileObject);
		    
			// Using delimiter to remove white spaces and other special characters
			// passwordFileScanObject.useDelimiter("\\s*[^a-zA-Z]\\s*");
			
		} catch (Exception e) { // Catching errors
	    	
	    	// e.printStackTrace();
	    	
	    	System.out.println("\nFile Error: File 'pwd.txt' not found!");
	      
	    }
	    	
		
		    
			// Using will loop to get each word on each line the file
			while(passwordFileScanObject.hasNext()) {
				
				String word = passwordFileScanObject.next();
				
				// Test
				// System.out.println("\nWord: " + word);
				
				// At least 8 characters in length
				// Each word should be not be less than 8 characters
				if(word.length() < 8) { // If the number of characters is less than 8
					
						// Add the password to the invalidpwd.txt file
						// writerInvalidpwd.println(word);
						
						// Add the word to the invalid ArrayList invalidPasswords which will be used to update invalidpwd.txtS
						invalidPasswords.add(word);
						
					
				} else {
						
						// Writes all valid passwords to the validpwd.txt file and all invalid passwords to the invalidpwd.txt file with the reason the entry is not valid.
					
						// Check if password has special character
						boolean verifySpecialCharacter = hasSpecial(word, specialCharaterList);
						// Test
						// System.out.println("Special: " + verifySpecialCharacter);
						
						// Check if password contain at least one upper-case character
						boolean verifyUppercase = hasUpper(word);
						// Test
						// System.out.println("UpperCase: " +verifyUppercase);
						
						
						// Check if password contain at least one lower-case character
						boolean verifyLowercase = hasLower(word);
						// Test
						// System.out.println("LowerCase: " + verifyLowercase);
						
						// Check if password contains one number character
						boolean verifyDigit = hasNumber(word);
						// Test
						// System.out.println("Digit: " + verifyDigit);
						
						
						// If the password has all the requirements
						if(verifySpecialCharacter && verifyUppercase && verifyLowercase && verifyDigit) {
							
							// Test
							// System.out.println("All conditions are met.");
							
							// Add the word to the valid ArrayList validPasswords which will then be use to update validpwd.txt
							validPasswords.add(word);
							
							// Test
							// System.out.println(validPasswords);
							
						} else {
							
							
							// Add the password to the validpwd.txt file
							// writerInvalidpwd.println(word); // Add line by line
							
							// Test
							// System.out.println("All conditons are NOT met.");
							
							// Add the word to the invalid ArrayList invalidPasswords which will be used to update invalidpwd.txtS
							invalidPasswords.add(word);
							
							// Test
							// System.out.println(invalidPasswords);
							
							
						}
						
				
				}
				
			}
			
			
			// Analysis complete. Closing files.
			System.out.println("Analysis complete. Closing files.");
			
			
			// UPDATE
			// Update the Valid Password File validpwd.txt with the validPasswords ArrayList
			for(int m = 0; m < validPasswords.size(); m++) {
					
					// Get each valid password
					String eachValidPassword = validPasswords.get(m);
				
					// Add each valid password to validpwd.txt
					 writerValidpwd.println(eachValidPassword); // Add line by line
					
					 // Test
					 // System.out.println(eachValidPassword);
			}
			
			// empty line
			System.out.println("");
			
			
			// Update the Invalid File invalidpwd.txt with the invalidPasswords ArrayList
			for(int n = 0; n < invalidPasswords.size(); n++) {
				
				// Get each valid password
				String eachInalidPassword = invalidPasswords.get(n);
			
				// Add each valid password to validpwd.txt
				writerInvalidpwd.println(eachInalidPassword); // Add line by line
				
				 // Test
				 // System.out.println(eachInalidPassword);
			}

			
			if(writerInvalidpwd != null) { // When the scanner object passwordFileScanObject is not null
	    		
	    		// Close the scanner object
    			writerInvalidpwd.close();
    			
    		}	
    		
    		if(writerValidpwd != null) { // When the scanner object passwordFileScanObject is not null
        		
	    		// Close the scanner object
    			writerValidpwd.close();
    			
    		}	
			
			
			//
			if(passwordFileScanObject != null) { // When the scanner object passwordFileScanObject is not null
	    		
	    		// Close the scanner object, scanObjec
    			passwordFileScanObject.close();
    		
    		}
		
		// Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the JavaBasic directory.
	    System.out.println("Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the JavaBasic directory.");	    
		
		// Displays messages to the user as shown in the example run.



		

	}

	
		// hasUpper() Method
		// Accepts a text variable as an argument and returns true if the text variable has as least one (1) upper case character and returns false if it does not.
		// Must contain at least one upper-case character
		public static boolean hasUpper(String eachWord){
			
			
			boolean containsUppercase = false;
			// For each word in each line on the file pwd.txt, do the following
			for (int i = 0; i < eachWord.length(); i++){
					
					// Must contain at least one special character
					if(Character.isUpperCase(eachWord.charAt(i))) {
						
						// If the word contains special character
						containsUppercase = true;
						
					}
				
			}
			
			return containsUppercase;
			
		}
		
		
		
		// hasLower() Method
		// Accepts a text variable as an argument and returns true if the text variable has as least one (1) lower case character and returns false if it does not.
		// Must contain at least one lower-case character
		public static boolean hasLower(String eachWord){
			
			
			boolean containsLowercase = false;
			// For each word in each line on the file pwd.txt, do the following
			for (int i = 0; i < eachWord.length(); i++){
					
					// Must contain at least one special character
					if(Character.isLowerCase(eachWord.charAt(i))) {
						
						// If the word contains special character
						containsLowercase = true;
						
					}
				
			}
			
			return containsLowercase;
			
		}
		
		
		// hasNumber()
		// Accepts a text variable as an argument and returns true if the text variable has as least one (1) number and returns false if it does not.
		// Must contain one number character
		public static boolean hasNumber(String eachWord){
			
			
			boolean containsDigit = false;
			// For each word in each line on the file pwd.txt, do the following
			for (int i = 0; i < eachWord.length(); i++){
					
					// Must contain at least one special character
					if(Character.isDigit(eachWord.charAt(i))) {
						
						// If the word contains special character
						containsDigit = true;
						
					}
				
			}
			
			return containsDigit;
			
		}

		
		
		// hasSpecial()
		// Accepts a text variable as an argument and returns true if the text variable has as least one (1) of the designated special characters and returns false if it does not.
		// Special Character List: ['@','#','%','-','&','*']
		// Must contain one of the following characters: @,#,%,-,&,*
		public static boolean hasSpecial(String eachWord, ArrayList<String> specialCharaterList){
			
			
			boolean specialCharacter = false;
			// For each word in each line on the file pwd.txt, do the following
			for (int i = 0; i < eachWord.length(); i++){
					
				    // NB: This will not work
					//- if(specialCharaterList.contains(eachWord.charAt(i)) {
					//- }
				
					char eachElementInWord = eachWord.charAt(i);
				
					// Must contain at least one special character
					if(specialCharaterList.contains(Character.toString(eachElementInWord))) {
						
						// If the word contains special character
					   	specialCharacter = true;
						
					}
				
			}
			
			return specialCharacter;
			
		}
		
			
	
	
	
}