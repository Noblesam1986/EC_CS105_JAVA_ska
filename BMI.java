package week4;

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		
		// Using Scanner for getting Input from user
				Scanner in = new Scanner(System.in);
				
				
				// Using in.nextLine()
				// String input = in.nextLine();
				
				
				// Asks a user for a person's height in inches 
				System.out.println("Please enter a person's height in inches:");
				
				// User's input is stored into a variable called heightInch 
				double heightInch = Double.parseDouble(in.nextLine());
				
				// Asks a user for a person's weight in pounds 
				System.out.println("Please enter a person's weight in pounds:");
				
				// User's input is stored into a variable called weightPound 
				double weightPound = Double.parseDouble(in.nextLine());
				
				// Converting from Inches to Meters
				double heightMeter = 0.0254 * heightInch;
				
				// Converting from Pounds to Kilograms
				double weightKg = 0.45359237 * weightPound;
				
				// Output heightMeter
				// System.out.println("The height in meters: " + heightMeter);
				
				// Output weightKg
				// System.out.println("The weight in kilograms: " + weightKg);
				
				
				// Calculating the BMI = weight/squared height
				double bmi = weightKg / (heightMeter * heightMeter);
				
				
				
				if (bmi < 18.5) {
					
					// If BMI is Below 18.5, Print the person is under weight
					System.out.println("The person's BMI is: " + bmi + "." + " " + "The person has a BMI classification of: Underweight");
					
				} else if(bmi >= 18.5 && bmi <=24) {
					
					// If BMI is greater than or equal to 18.5 and less than or equal 24
					// The person is normal
					System.out.println("The person's BMI is: " + bmi + "." + " " + "The person has a BMI classification of: Normal");
					
				} else if(bmi >= 25.0 && bmi <=29.9) {
					
					// If BMI is greater than or equal to 25.0 and less than or equal 29.9
					// The person is overweight 
					System.out.println("The person's BMI is: " + bmi + "." + " " + "The person has a BMI classification of: Overweight");
					
				} else {
					
					// If BMI is above 30 then the person is obese
					System.out.println("BMI of " + bmi + " " + "is Obese.");
				}
				
				
				
			 in.close();
			
		} // end of main()
	
	

}// end of class BMI