/*
 * In this example, you will create a point-of-sale system for a hamburger joint.  
 * The base price for a burger is $2.99. Your program will ask the user whether 
 * they want bacon ($.50 addon), cheese ($1.00 addon) or pickles ($.25 addon). 
 * It will then ask if they want fries ($1.00) and a softdrink ($1.50). If they 
 * choose to super-size the order, the total of the fries and softdrink will be 
 * multiplied by 150%. You will ask them how many burgers they’d like. In the end, 
 * you’ll print how much they owe including an 8.75% tax.
 */
import java.util.Scanner;
public class Burgers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Welcome to BurgerZone ***");
		System.out.println();
		double burgerPrice = 2.99;
		double bacon = 0.5;
		double cheese = 1.0;
		double pickles = 0.25;
		double drink = 1.50;
		double fries = 1.00;
		double superSizeSurcharge = 1.5;
		System.out.print("How many burger meals would you like to buy? ");
		int count = sc.nextInt();
		System.out.print("Do you want to add bacon? ");
		String addBacon = sc.next().trim().toLowerCase();  // removes blanks before and after the user's input
		System.out.print("Do you want cheese? ");
		String addCheese = sc.next().trim().toLowerCase();
		System.out.print("Do you want pickles? ");
		String addPickles = sc.next().trim().toLowerCase();
		System.out.print("Do you want to add fries? ");
		String addFries = sc.next().trim().toLowerCase();
		System.out.print("Do you want to add a drink? ");
		String addDrink = sc.next().trim().toLowerCase();
		String superSize;
		if (addFries.equals("y") || addDrink.equals("y")) {
			System.out.print("Do you want to supersize? ");
			superSize = sc.next().trim().toLowerCase();
		} else {
			superSize = "n";
		}
		double totalPerMeal = burgerPrice;
		if (addBacon.equals("y")) {
			totalPerMeal = totalPerMeal + bacon;
		}
		if (addCheese.equals("y")) {
			totalPerMeal = totalPerMeal + cheese;
		}
		if (addPickles.equals("y")) {
			totalPerMeal += pickles;   // totalPerMeal = totalPerMeal + pickles
		}
		double friesAndDrink = 0;
		if (addFries.equals("y")) {
			friesAndDrink = friesAndDrink + fries;
		}
		if (addDrink.equals("y")) {
			friesAndDrink = friesAndDrink + drink;
		}
		if (superSize.equals("y")) {
			friesAndDrink = friesAndDrink * superSizeSurcharge;  // friesAndDrink *= superSizeSurcharge
		}
		totalPerMeal = totalPerMeal + friesAndDrink;
		double totalForOrder = count * totalPerMeal;
		System.out.printf("Your cost for %d meals is $%.2f.\n", count, totalForOrder);
	}
}
