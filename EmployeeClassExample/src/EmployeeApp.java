
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		/*
		Employee emp1 = new Employee();
		emp1.setFirstName("Ray");
		emp1.setPayRate(17.35);
		Employee emp2 = new Employee("Lauren","Jones",17.35, 15.25);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		EmployeeWriter.writeToScreen(employees);
		if (EmployeeWriter.writeToFile(employees,"c:\\temp\\emps11am.txt") == true) {
			System.out.println("Success");
		} else {
			System.out.println("You are unlucky today.");
		}
		*/
		/* 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of file that has employee data: ");
		String fileName = sc.nextLine();
		ArrayList<Employee> emps = EmployeeReader.readFromFile(fileName);
		double grossPay;
		PaycheckPrinter pp = new PaycheckPrinter(0.125);
		if (emps == null) {
			System.out.println("The file of employees could not be read.");
		} else {
			EmployeeWriter.writeToScreen(emps);
			grossPay = emps.get(1).calculateGrossPay();
			System.out.println(grossPay);
			pp.printPaychecks(emps);
		}
		*/
		Employee emp = new Employee("Mary","Jones",17.50,22.5);
		emp.addResponsibility("Wash dishes");
		emp.addResponsibility("Clean toilets");
		System.out.println(emp);
	}
}
