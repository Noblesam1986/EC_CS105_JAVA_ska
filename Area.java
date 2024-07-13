package week3;

import java.util.Scanner;

public class Area {
	
public static void main(String[] args) {
		
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		
		// Ask for the width of the square
		System.out.println("Please enter the width of the square:");
		int sqWidth = Integer.parseInt(in.nextLine());
		
		// Ask for the width of the rectangle
		System.out.println("Please enter the width of the rectangle:");
		int recWidth = Integer.parseInt(in.nextLine());
		
		// Ask for the height of the rectangle
		System.out.println("Please enter the height of the rectangle:");
		int recHeight = Integer.parseInt(in.nextLine());
		
		// Calculating the area of the square and the area of the rectangle
		int sqArea = sqWidth * sqWidth;
	    int recArea = recWidth * recHeight;
		
	    // Output the results
		System.out.println("The area of a square with a width of " + sqWidth + " " + "is " + sqArea);
		System.out.println("The area of a rectangle with a width of " + recWidth + " " + "and a height of " + recHeight + " " + "is " + recArea);
		
		in.close();
		
	} // end of main()

} // end of class Area
