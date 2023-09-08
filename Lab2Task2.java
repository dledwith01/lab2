//FILENAME: Lab2Task2.java
//STUDENT NAME: DANIEL LEDWITH
//STUDENT UIN: 01265466
//DATE: 09/08/2023

//For more information, refer to Lab2Algorithms.txt

package odu.cs151.lab2task2;

import java.util.Scanner;

public class Lab2Task2 {

	public static void main(String[] args) {
		//variables to store user input and result
		double score1, score2, score3, score4, average;
		
		//prompt user for input
		System.out.print("Enter four test scores: ");
		Scanner sc = new Scanner(System.in);
		
		//collect and store user input
		score1 = sc.nextDouble();
		score2 = sc.nextDouble();
		score3 = sc.nextDouble();
		score4 = sc.nextDouble();
		
		sc.close();
		
		//compute average (scores/count of scores)
		average = (score1 + score2 + score3 + score4)/4;
		
		//show result
		System.out.println("Average of four test scores: " + average);
		
		

	}

}
