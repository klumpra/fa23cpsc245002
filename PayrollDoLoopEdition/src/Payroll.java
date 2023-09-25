/*
 * Illustrates the use of a do loop
 */
import java.util.Scanner;
public class Payroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gross, hours, rate;
		String doAgain;
		do {
			System.out.print("Enter hours and rate: ");
			hours = sc.nextDouble();
			rate = sc.nextDouble();
			gross = hours * rate;
			System.out.printf("Gross is $%.2f.\n", gross);
			System.out.print("Do you have another employee - y or n? ");
			doAgain = sc.next().trim().toUpperCase();
		} while (doAgain.equals("Y"));
		System.out.println("Thank you.");
	}
}
