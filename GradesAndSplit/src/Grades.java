/*
 * This program demonstrates the split function and working with files
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputFileName, outputFileName;
		System.out.print("Enter the name of the input file: ");
		inputFileName = sc.nextLine();
		System.out.print("Enter the name of the output file: ");
		outputFileName = sc.nextLine();
		try {
			Scanner fsc = new Scanner(new File(inputFileName));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outputFileName))));
			String line;
			String[] parts;
			String name;
			double total, average;
			while (fsc.hasNextLine()) {
				total = 0;  // new student
				line = fsc.nextLine().trim();
				if (line.length() > 0) {  // ignore blank lines
					parts = line.split("\t");
					name = parts[0];
					for (int i = 1; i < parts.length; i++) {
						total = total + Double.parseDouble(parts[i]);
					}
					average = total / (parts.length - 1);
					pw.printf("%-15s%10.2f\n", name,average);
				}
			}
			fsc.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("The file could not be read.");
//			ex.printStackTrace();
		}
		
	}
}
