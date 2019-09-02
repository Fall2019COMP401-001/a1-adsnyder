package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		//Setting up scanner to grab user input
		Scanner scan = new Scanner(System.in);
		
		//Declaring all variables & initializing those that need to initialized
		int customerNumber;
		int itemNumber;
		double itemTotal;
		double itemCost;
		double totalCost = 0;
		String firstName;
		String lastName;
		String throwawayString;
		
		//Grabbing number of customers
		customerNumber = scan.nextInt();
		
		for(int i = 0; i < customerNumber; i++) {
			
			//Grabbing first name, last name, and total # of items being bought of current customer
			firstName = scan.next();
			lastName = scan.next();
			itemTotal = scan.nextInt();
			
			for(int j = 0; j < itemTotal; j++) {
				
				//Grabbing how many of the current item are being bought, as well as its unit cost
				itemNumber = scan.nextInt();
				throwawayString = scan.next();
				itemCost = scan.nextDouble();
				
				//Adding this set of items' cost to the total cost for the customer
				totalCost = totalCost + itemNumber * itemCost;
			}
		
			//Printing out the first initial, last name, and total cost for the current customer
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + String.format("%.2f", totalCost));
			
			//Resetting total cost to zero
			totalCost = 0;
		}
	}
}
