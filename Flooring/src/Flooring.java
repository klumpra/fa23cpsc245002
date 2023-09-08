/*
 * Ray Klump
 * 9/8/2023
 * This calculates how much flooring is needed for a room and what it will cost.
 * 
 */
public class Flooring {
	public static void main(String[] args) {
		// declare given information
		double roomWidth = 25.5;
		double roomLength = 29.25;
		int planksPerPack = 6;
		double plankWidth = 8/12.0;
		double plankLength = 28/12.0;
		double packageCost = 39.99;
		double taxRate = 0.0875;
		
		// calculate important quantities
		double roomArea = roomWidth * roomLength;
		double coveragePerPackage = planksPerPack * plankWidth * plankLength;
		double packagesNeeded = Math.ceil(roomArea / coveragePerPackage);
		double costOfPackages = packagesNeeded * packageCost;
		double taxes = taxRate * costOfPackages;
		double totalCost = costOfPackages + taxes;
		
		// output the results
		System.out.println("****************************************");
		System.out.printf("%-25s%10.2f\n","Area of room",roomArea);
		System.out.printf("%-25s%10.2f\n","Number of packs",packagesNeeded);
		System.out.printf("%-25s%10.2f\n","Cost of packs",costOfPackages);
		System.out.printf("%-25s%10.2f\n","Taxes",taxes);
		System.out.printf("%-25s%10.2f\n","Total cost",totalCost);		
		System.out.println("****************************************");
		
		
		
		
		
	}
}
