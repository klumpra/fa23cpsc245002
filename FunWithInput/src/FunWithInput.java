import java.util.Scanner;
public class FunWithInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("Enter your full name: ");
		String fullName = sc.nextLine();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		int ageInMonths = age * 12;
		System.out.printf("Greetings, %s. You are %d months old.\n", 
				fullName, ageInMonths);
		*/
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();  // sucks in the EOL
		System.out.print("Enter your full name: ");
		String fullName = sc.nextLine();
		int ageInMonths = age * 12;
		System.out.printf("Greetings, %s. You are %d months old.\n", 
				fullName, ageInMonths);

	}
}
