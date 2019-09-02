package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		//Setting up scanner to grab user input
		Scanner scan = new Scanner(System.in);
		
		//Declaring first set of variables and initializing those that need to be initialized
		int itemNumber = scan.nextInt();
		String[] itemArr = new String[itemNumber];
		Double[] costArr = new Double[itemNumber];
		
		//Adding each item & its relevant cost to the item & cost arrays
		for(int i = 0; i < itemNumber; i++) {
			itemArr[i] = scan.next();
			costArr[i] = scan.nextDouble();
		}
		
		//Declaring second set of variables and initializing those that need to be initialized
		int customerNumber = scan.nextInt();
		String[] names = new String[customerNumber];
		Double[] totalCosts = new Double[customerNumber];
		
		//Grabbing the names & total costs of each customer and dropping them into the names & total costs arrays
		for(int i = 0; i < customerNumber; i++) {
			names[i] = scan.next() + " " + scan.next();
			
			int customerItems = scan.nextInt();
			double totalCost = 0;
			
			//Summing the total cost for each customer
			for(int j = 0; j < customerItems; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				
				//Mathing out the cost of each item quantity
				for(int k = 0; k < itemArr.length; k++) {
					if (itemName.equals(itemArr[k])) {
						double cost = quantity * costArr[k];
						totalCost = totalCost + cost;
					}
				}
				totalCosts[i] = totalCost;
			}
		}
		
		////Declaring third set of variables and initializing those that need to be initialized
		double average;
		double summedCost = 0;
		double highestCost = totalCosts[0];
		String highestCostName = names[0];
		double lowestCost = totalCosts[0];
		String lowestCostName = names[0];
	
		for(int i = 0; i < totalCosts.length; i++) {
			
			//Comparing the cost of the current array index with the logged lowest cost & replacing the log if necessary
			if(lowestCost > totalCosts[i]) {
				lowestCost = totalCosts[i];
				lowestCostName = names[i];
			}
			
			//Comparing the cost of the current array index with the logged highest cost & replacing the log if necessary
			if(highestCost < totalCosts[i]) {
				highestCost = totalCosts[i];
				highestCostName = names[i];
			}
			
			//Summing the total costs for averaging use
			summedCost = summedCost + totalCosts[i];
		}
		
		//Finding the average total cost
		average = summedCost / totalCosts.length;
		
		System.out.println("Biggest: " + highestCostName + " (" + highestCost + ")");
		System.out.println("Smallest: " + lowestCostName + " (" + lowestCost + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}
