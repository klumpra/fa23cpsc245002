import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class Groceries {
	public static void printGroceriesAndPrices(ArrayList<String> names, ArrayList<Double> prices) {
		for (int i = 0; i < names.size(); i++) {
			System.out.printf("%-15s%10.2f\n", names.get(i), prices.get(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of file: ");
		String filename = sc.nextLine();
		boolean success;
		String line;
		String[] parts;
		String name;
		double price;
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		try {
			Scanner fsc = new Scanner(new File(filename));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				if (line.length() == 0) {
					continue;  // goes to the top of the while loop for the next iteration
				} 
				parts = line.split("\t");
				name = parts[0];
				price = Double.parseDouble(parts[1]);
				names.add(name);
				prices.add(price);
			}
			fsc.close();
			success = true;
		} catch (Exception ex) {
			System.out.println("The file of grocery items could not be read.");
			success = false;
		}
		if (!success) {
			System.out.println("Could not continue.");
			return;  // when you return out of main, you leave the program. An alternative: System.exit(#)
			// System.exit(1);  // 1 or any nonzero indicates a failed run
		}
		System.out.println("Here is the list of groceries and their prices: ");
		printGroceriesAndPrices(names,prices);
		names.add(1,"frozen pizza");
		prices.add(1,7.79);
		System.out.println();
		printGroceriesAndPrices(names,prices);
	}
}
