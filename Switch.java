package week11;

import java.util.Scanner;   // Needed for user input

public class Switch {
	
	public static void main(String[] args) {
		
		
		Scanner sIn = new Scanner(System.in); //Input Scanner for String
        String choice;
        boolean done = false;
        
    	do {
    		//Describe the program functionality
	        System.out.println("This program will show the name of an apostle based on the order they were called, with the Prophet as #1 \n");
	    	System.out.print("Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): ");
	    	
	    	choice = sIn.nextLine();
	    	
			if(choice.equals("")) {	
				
				// Exit
				System.exit(0);
				
			} else {
			    	//Call the playMath method passing the appropriate argument
			    	switch (choice) {
			    	
			    	case "1":
			    		
			    		System.out.println("Number " + choice + " is: " + "Russel M. Nelson \n\n");
			    		break;
		
			    	case "2":
			    		
			    		System.out.println("Number " + choice + " is: " + "Dallin H. Oaks \n\n");
			    		break;
			    		
			    	case "3":
			    		
			    		System.out.println("Number " + choice + " is: " + "M. Russel Ballard \n\n");
			    		break;
			    		
			    	case "4":
			    		
			    		System.out.println("Number " + choice + " is: " + "Jeffrey R. Holland \n\n");
			    		break;
			    		
			    	case "5":
			    		
			    		System.out.println("Number " + choice + " is: " + "Henry B. Eyring \n\n");	
			    		break;
			    		
			    	case "6":
			    		
			    		System.out.println("Number " + choice + " is: " + "Dieter F. Uchtdorf \n\n");
			    		break;
			    		
			    	case "7":
			    		
			    		System.out.println("Number " + choice + " is: " + "David A. Bednar \n\n");
			    		break;
			    		
			    	case "8":
			    		
			    		System.out.println("Number " + choice + " is: " + "Quentin L. Cook \n\n");
			    		break;
			    		
			    	case "9":
			    		
			    		System.out.println("Number " + choice + " is: " + "D. Todd Christofferson \n\n");
			    		break;
			    		
			    	case "10":
			    		
			    		System.out.println("Number " + choice + " is: " + "Neil L. Andersen \n\n");
			    		break;
			    		
			    	case "11":
			    		
			    		System.out.println("Number " + choice + " is: " + "Ronald A. Rasband \n\n");
			    		break;
			    		
			    	case "12":
			    		
			    		System.out.println("Number " + choice + " is: " + "Gary E. Stevenson \n\n");
			    		break;
			    		
			    	case "13":
			    		
			    		System.out.println("Number " + choice + " is: " + "Dale G. Renlund \n\n");
			    		break;
			    		
			    	case "14":
			    		
			    		System.out.println("Number " + choice + " is: " + "Gerrit W. Gong \n\n");
			    		break;
			    		
			    	case "15":
			    		
			    		System.out.println("Number " + choice + " is: " + "Ulisses Soares \n\n");
			    		break;
			    		
			    	default:
			    		
			    		System.out.println("\n That's not a valid choice. Try again. \n\n");
			    		
			    	}//end of switch (choice)
			
				    	
			} // End of if else statement
				    	
				 
	    	
    	}while (!done); //end of do/while(!done)
    	
	}//end of main()
	
	

}
