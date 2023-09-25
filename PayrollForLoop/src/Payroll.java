/*
 * Demonstrates using a for loop
 */

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empCount;
		System.out.print("How many employees do you have? ");
		empCount = sc.nextInt();
		double gross, hours, rate;
		for (int i = 0; i < empCount; i++) {
			System.out.print("Enter hours and rate: ");
			hours = sc.nextDouble();
			rate = sc.nextDouble();
			gross = hours * rate;
			System.out.printf("Your gross pay is $%.2f.\n", gross);
		}
		System.out.println("Thank you.");
	}
}
