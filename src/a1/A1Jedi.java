package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		//Setting up scanner to grab user input
		Scanner scan = new Scanner(System.in);
		
		//Declaring first set of variables and initializing those that need to be initialized
		int itemNumber = scan.nextInt();
		String[] itemArr = new String[itemNumber];
		int[] itemCountArr = new int[itemNumber];
		int[] customerItemCountArr = new int[itemNumber];
		String throwawayString;
		Double throwawayDouble;
		
		//Adding each item & its relevant cost to the item & cost arrays
		for(int i = 0; i < itemNumber; i++) {
			itemArr[i] = scan.next();
			throwawayDouble = scan.nextDouble();
		}
		
		//Declaring second set of variables and initializing those that need to be initialized
		int customerNumber = scan.nextInt();
		
		for(int i = 0; i < customerNumber; i++) {
			//Throwing away unnecessary user input
			throwawayString = scan.next();
			throwawayString = scan.next();
			
			//Grabbing the total number of items bought by the current customer
			int customerItems = scan.nextInt();
			
			//Adding all the items & # of customers who've bought them
			for(int j = 0; j < customerItems; j++) {
				int itemNum = scan.nextInt();
				String itemName = scan.next();
				
				for(int k = 0; k < itemArr.length; k++) {
					if(itemArr[k].equals(itemName)) {
						itemCountArr[k] = itemCountArr[k] + itemNum;
						customerItemCountArr[k]++;
					}
				}
			}
		}
		
		//Displaying the # of items bought & the # of customers who bought them
		for(int i = 0; i < itemArr.length; i++) {
			if(itemCountArr[i] == 0) {
				System.out.println("No customers bought " + itemArr[i]);
			}
			else {
				System.out.println(customerItemCountArr[i] + " customers bought " + itemCountArr[i] + " " + itemArr[i]);
			}
		}
	}
}
