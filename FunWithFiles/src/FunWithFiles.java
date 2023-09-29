/*
 * This program illustrates how to read from and write to a text file.
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class FunWithFiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName;
		System.out.print("Enter the path to the file you want to read: ");
		fileName = sc.nextLine();
		System.out.print("Enter the path to the output file: ");
		String outFileName = sc.nextLine();
		try {
//			Scanner fsc = new Scanner(new File("c:\\temp\\friday.txt"));
			Scanner fsc = new Scanner(new File(fileName));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outFileName))));
			String line;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().toUpperCase();
				System.out.println(line);
				pw.println(line);
			}
			fsc.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("There was a problem accessing the file.");
		}
	}
}
