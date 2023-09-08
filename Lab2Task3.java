//FILENAME: Lab2Task3.java
//STUDENT NAME: DANIEL LEDWITH
//STUDENT UIN: 01265466
//DATE: 09/08/2023

//For more information, refer to Lab2Algorithms.txt

package odu.cs151.lab2task3;

import java.util.Scanner;

public class Lab2Task3 {

	public static void main(String[] args) {
		// Information given in prompt
		final double COST_PER_LITER = 0.38;		// in dollars
		final double PROFIT_PER_CARTON = 0.27;	// in dollars
		final double CARTON_CAPACITY = 3.78; 	// in liters
		
		// Variables to store user input and results
		double litersProduced;
		int cartonsNeeded;
		double productionCost;
		double profit;
		
		// Prompt user for input
		System.out.print("Enter how much milk was produced in liters: ");
		Scanner sc = new Scanner(System.in);
		
		// Collect input from user
		litersProduced = sc.nextInt();
		sc.close();
		
		// Compute number of cartons needed
		cartonsNeeded = (int)(0.5 + (litersProduced / CARTON_CAPACITY));
		
		// Compute cost of production
		productionCost = litersProduced * COST_PER_LITER;
		
		// Compute total profit
		profit = cartonsNeeded * PROFIT_PER_CARTON;
		
		// Show result
		System.out.println("Milk cartons needed: " + cartonsNeeded);
		System.out.printf("Cost of production: $%.2f", productionCost);
		System.out.printf("\nTotal profit: $%.2f",profit);
		
	}

}
