/*
 * Illustrates using ArrayList objects.
 * Generate 10 random integers, store them in an ArrayList, and mess around with them.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class FunWithArrayLists {
	public static void printNumbers(ArrayList<Integer> nums) {
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	}
	public static void printNumbersAlt(ArrayList<Integer> nums) {
		for (int num : nums) {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rnd = new Random();
		int num;
		for (int i = 0; i < 10; i++) {
			num = rnd.nextInt(100);
			numbers.add(num);
		}
		printNumbersAlt(numbers);
		Collections.sort(numbers);
		System.out.println("Here is the list sorted: ");
		printNumbersAlt(numbers);
		System.out.print("What value do you want to insert and where? ");
		int val, pos;
		val = sc.nextInt();
		pos = sc.nextInt();
		numbers.add(pos,val);
		printNumbers(numbers);
		System.out.print("Enter the position of what you want to remove: ");
		pos = sc.nextInt();
		numbers.remove(pos);
		printNumbers(numbers);
		System.out.print("Enter the value you want to remove: ");
		val = sc.nextInt();
		numbers.remove(Integer.valueOf(val));
		printNumbers(numbers);
		// randomly select a value from the list and show it
		pos = rnd.nextInt(numbers.size());
		val = numbers.get(pos);
		System.out.printf("The randomly selected value is %d.\n", val);
	}
}
