//**************************************************************************************************************
//
//  EvenNumSum.java		Author: Fischer
//
//  Asks user to input an integer greater than one. Prints the sum of all even integers between
//  2 and the user input integer (inclusive).  Prints an error message if user inputs integer less than 2 and 
//  prompt user to enter another number.
//**************************************************************************************************************

import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		int integer, i;

		int even_sum = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a whole number larger than 1.  ");
		integer = scan.nextInt();

		while (integer < 2) {
			System.out.print("Please try again. \nPlease enter a whole number larger than 1.  ");
			integer = scan.nextInt();
		}

		if (integer >= 2) {

			for (i = 2; i <= integer; i = i + 2) {
				even_sum = even_sum + i;
			}

			System.out.println("The sum of all even numbers is " + even_sum + ".");
		}

	}

}