/*
 * This program demonstrates using arrays.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * This application generates 10 random integers and then performs statistics on them.
 * Specifically, min, max, and mean.
 */
public class FunWithArrays {
	public static void printWelcome() {
		System.out.println("************************");
		System.out.println("    Fun With Arrays");
		System.out.println("************************");
		System.out.println();
	}
	public static void printMenu() {
		System.out.println("Here are you choices: ");
		System.out.println("1. Find min");
		System.out.println("2. Find max");
		System.out.println("3. Find mean");
		System.out.println("4. Print numbers");
		System.out.println("5. Quit");
		System.out.print("Enter the number of your choice: ");
	}
	public static void print(int[] nums) {
		for (int num : nums) {
			System.out.println(num);
		}
	}
	public static int findMin(int[] nums) {
		int theMin = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < theMin) {
				theMin = nums[i];
			}
		}
		return theMin;
	}
	public static int findMax(int[] nums) {
		int theMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > theMax) {
				theMax = nums[i];
			}
		}
		return theMax;
	}
	public static double findMean(int[] nums) {
		double total = 0;
		for (int num : nums) {
			total = total + num;
		//	total += num;
		}
		double result = total / nums.length;
		return result;
	}
	public static int[] generateNumbers(int numNums) {
		Random rnd = new Random();
		int[] result = new int[numNums];
		for (int i = 0; i < numNums; i++) {
			result[i] = rnd.nextInt(100);
		}
		return result;
	}
	public static void main(String[] args) {
		printWelcome();
		int choice;
		Scanner sc = new Scanner(System.in);
		// generate 10 random integers
		/*
		int[] numbers = new int[10];
		Random randy = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = randy.nextInt(100);
		}
//		print(numbers);
 * 		
 */
		int[] numbers = generateNumbers(10);
		int theMin, theMax;
		double theMean;
		do {
			printMenu();
			choice = sc.nextInt();
			if (choice > 5) {
				System.out.println("You messed up. Choices are 1 through 5.");
			} else if (choice == 1) {
				theMin = findMin(numbers);
				System.out.printf("The min is %d.\n", theMin);
			} else if (choice == 2) {
				theMax = findMax(numbers);
				System.out.printf("The max is %d.\n", theMax);
			} else if (choice == 3) {
				theMean = findMean(numbers);
				System.out.printf("The mean is %.2f.\n", theMean);
			} else if (choice == 4) {
				System.out.println("Here are the numbers: ");
				print(numbers);
				System.out.println();
			}
		} while (choice != 5);
		System.out.println("Thank you for using this program.");
		sc.close();
	}
}
