/*
 * This program reads a file of text into a String
 * The individual lines of the file are separated from each other by a space.
 */
import java.util.Scanner;
import java.io.File;

public class ReadFromFile {
	/**
	 * This function returns the text of a file or null
	 * @param fname the name of the file to process
	 * @return a string containing all the text of the file separated by spaces or null if it fails
	 */
	public static String readFile(String fname) {
		try {
			String allTogether = "";
			Scanner fsc = new Scanner(new File(fname));
			String line;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine();
				allTogether = allTogether + line + " ";
			}
			fsc.close();
			return allTogether;
		} catch (Exception ex) {
			return null;  // indicates that we failed
		}
	}
	public static void main(String[] args) {
		String fname;
		Scanner sc = new Scanner(System.in);
		System.out.print("What file do you want to read? ");
		fname = sc.nextLine();
		/*
		String allTogether = "";
		try {
			Scanner fsc = new Scanner(new File(fname));
			String line;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine();
				allTogether = allTogether + line + " ";
			}
			allTogether = allTogether.trim();  // gets rid of trailing space
			System.out.println(allTogether);
			fsc.close();
		} catch (Exception ex) {
			System.out.println("Could not read the file.");
		}
		*/
		String allTogether = readFile(fname);
		if (allTogether == null) {
			System.out.println("Could not read the file.");
		} else {
			System.out.println(allTogether);
		}
		System.out.println(allTogether);
	}
}
