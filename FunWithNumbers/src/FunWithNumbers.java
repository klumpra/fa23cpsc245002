/*
 * This illustrates menu-driven programs and catching exceptions
 */

import java.util.Scanner;

/**
 * This program asks the user for two numbers and then offers them a menu
 * of options concerning what arithmetic to do with them.
 */
public class FunWithNumbers {
	public static void printWelcome() {
		System.out.println("*".repeat(60));
		System.out.println(" ".repeat(22) + "Fun With Numbers");
		System.out.println("*".repeat(60));
		System.out.println();
	}
	public static void printMenu() {
		System.out.println("Here are you choices: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Quit");
		System.out.print("Enter the number of your choice: ");
	}
	public static void main(String[] args) {
		printWelcome();
		// ask the user for the numbers they want to work with
		Scanner sc = new Scanner(System.in);
		double num1=0, num2=0;
		double sum, diff, prod, quot;
		boolean proceed;
		do {
			proceed = true;
			System.out.print("Enter the two numbers: ");
			try {
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
			} catch (Exception ex) {
				System.out.println("You needed to enter two numbers.");
				// ex.printStackTrace();   // keep here during development and testing; comment before sending to customer
				// return;   // get out of main - leave the program
				sc.nextLine();  // cleans out the input channel - the user will start entering fresh
				proceed = false;
			}
		} while (proceed == false);
		int choice;
		do {
			printMenu();
			choice = sc.nextInt();
			if (choice == 1) {
				sum = num1 + num2;
				System.out.printf("%.2f + %.2f = %.2f\n",num1,num2,sum);
			} else if (choice == 2) {
				diff = num1 - num2;
				System.out.printf("%.2f - %.2f = %.2f\n",num1,num2,diff);
			} else if (choice == 3) {
				prod = num1 * num2;
				System.out.printf("%.2f * %.2f = %.2f\n",num1,num2,prod);
			} else if (choice == 4) {
				if (num2 == 0) {
					System.out.println("You cannot divide by 0.");
				} else {
					quot = num1/num2;
					System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, quot);
				}
			} else if (choice != 5) {
				System.out.println("Dude ... enter 1 through 5.");
			}
		} while (choice != 5);
		System.out.println("Thank you.");
	}
}
