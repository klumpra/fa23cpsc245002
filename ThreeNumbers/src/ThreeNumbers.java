/*
 * Ray Klump
 * this program computes the sum and product of three integers.
 * purpose is to demonstrate how to write and use functions
 */
import java.util.Scanner;
public class ThreeNumbers {
	public static int computeSum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	public static int computeProd(int a, int b, int c) {
		int result = a * b * c;
		return result;
	}
	public static void printWelcome() {
		System.out.println("*".repeat(60));
		System.out.println(" ".repeat(21) + "Welcome to AddProd");
		System.out.println("*".repeat(60));
		System.out.println();
	}
	public static void main(String[] args) {
		printWelcome();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		int sum, prod;
		sum = computeSum(num1,num2,num3);
		prod = computeProd(num1,num2,num3);
		System.out.printf("The sum is %d, and the product is %d.\n", sum, prod);
		sc.close();
	}
}
