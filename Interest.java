package week3;

import java.util.Scanner;

public class Interest {

public static void main(String[] args) {
		
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		
		// Ask for the amount to be deposited every month
		System.out.println("Please enter the amount to be deposited each month:");
		float monthlyDeposit = Float.parseFloat(in.nextLine());
		
		// Ask for the annual interest rate percent - Just the number without the /100 or Percent
	    System.out.println("Please enter the annual interest rate percent:");
	    float annualRate = Float.parseFloat(in.nextLine());
		
	    float monthlyRate = annualRate/100/12;
		
		// Balance after one month
	    float balanceAmount = monthlyDeposit*(1 + monthlyRate);
		
	    // Balance after two months
	    balanceAmount = (monthlyDeposit + balanceAmount)*(1 + monthlyRate);
	    
	    //Balance after three months
	    balanceAmount = (monthlyDeposit + balanceAmount)*(1 + monthlyRate);
		
		// Balance after four months
	    balanceAmount = (monthlyDeposit + balanceAmount)*(1 + monthlyRate);
	    
	    // Balance after five  months
	    balanceAmount = (monthlyDeposit + balanceAmount)*(1 + monthlyRate);
	    
	    // Balance after six months
	    balanceAmount = (monthlyDeposit + balanceAmount)*(1 + monthlyRate);
	    
	    // Output the balance after six months
		System.out.println("The ending balance after 6 months is; " + " " + "$" + balanceAmount);
		
		in.close();
		
	} // end of main()
	
} // end of class Interest
