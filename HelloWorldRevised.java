package week3;

import java.util.Scanner;

public class HelloWorldRevised {

	public static void main(String[] args) {
		
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		
		// Ask the user's name
		System.out.println("Please enter your name:");
		String userName = in.nextLine();
		System.out.println("Hello " + userName + "!");
		
		// Ask the favorite dessert
		System.out.println("\n" + "What is your favorite dessert?");
		String userDessert = in.nextLine();
		System.out.println("I hope you like coding Java as much as you like to eat " + userDessert + ".");
		
		// Ask the favorite color
		System.out.println("\n" + "What is your favorite color?");
		String userColor = in.nextLine();
		System.out.println("So, you like the color " + userColor + "." + " " + "My favorite color is 0000ff.");
		
		// Ask the place of birth
		System.out.println("\n" + "Where were you born?");
		String userCountry = in.nextLine();
		System.out.println("I was born in Silicon Valley. If I had been born in " + userCountry + "," + " " + "perhaps we would have been friends.");
		
		// Ask the favorite pet
		System.out.println("\n" + "What is your favorite kind of pet?");
		String userPet = in.nextLine();
		System.out.println("I'm sure a " + userPet + " " + "is safer than my pet. I have a pet mouse.... but it always BYTES! HaHaHa!");
		
		// Ask the favorite insect
		System.out.println("\n" +"What is your favorite insect?");
		String userInsect = in.nextLine();
		System.out.println("Wow! You like " + userInsect + "!?!" + " " +"I like spiders. They make great WEB sites but sometimes they BUG me!");
		
		// Ask the favorite speaker at the last General Conference
		System.out.println("\n" + "Who was your favorite speaker at the last General Conference?");
		String userSpeaker = in.nextLine();
		System.out.println("I agree. " + userSpeaker + " " + "was great! I'm just glad they didn't make Java against the Word of Wisdom!!!");
		
		
		in.close();
		
	} // end of main()
	
	
} // end of class HelloWordRevised
