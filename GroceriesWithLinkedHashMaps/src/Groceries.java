import java.util.LinkedHashMap;
import java.util.Scanner;
import java.io.File;
public class Groceries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of file: ");
		String filename = sc.nextLine();
		boolean success;
		String line;
		String[] parts;
		String name;
		double price;
		/*
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		*/
		LinkedHashMap<String,Double> groceries = new LinkedHashMap<String,Double>();
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
				/*
				names.add(name);
				prices.add(price);
				*/
				groceries.put(name, price);
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
		String selection;
		System.out.print("Enter the name of the item or q to quit: ");
		selection = sc.nextLine();
		while (!selection.equals("q")) {
			if (!groceries.containsKey(selection)) {
				System.out.println("That item is out of stock.");
			} else {
				price = groceries.get(selection);
				System.out.printf("The item %s costs $%.2f.\n", selection, price);
			}
			System.out.print("Enter another selection: ");
			selection = sc.nextLine();
		}
		System.out.println("Thank you for shopping.");
	}
}