//FILENAME: Lab2Task1.java
//STUDENT NAME: DANIEL LEDWITH
//STUDENT UIN: 01265466
//DATE: 09/08/2023

//For more information, refer to Lab2Algorithms.txt

package odu.cs151.lab2task1;

import java.util.Scanner;
import java.lang.Math;

public class Lab2Task1 {

	public static void main(String[] args) {
		// Variables to store user input and result
		double x1, y1, x2, y2, a, b, c;
		
		// Collect and store user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2: ");
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();
		sc.close();

		// Calculate distance between (x1, y1) and (x2, y2)
		//Pythagoras says a^2 + b^2 = c^2
		a = (x2 - x1);
		b = (y2 - y1);
		
		// c is equal to the distance we seek
		c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		
		// Display result to user
		System.out.println("Distance: " + c);
		
	}

}
