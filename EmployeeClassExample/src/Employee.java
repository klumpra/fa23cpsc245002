import java.util.ArrayList;
/*
 * This is a blueprint class that models what it means to be an employee
 */
public class Employee {
	// declare our data as private
	private String firstName;
	private String lastName;
	private double hoursWorked;
	private double payRate;
	private ArrayList<String> responsibilities;
	
	// declare our functions as mostly public, with two constructors and gets and sets
	public Employee() {
		this("Default","Employee",0,0);
	}
	public Employee(String fn, String ln, double pr, double hw) {
		setFirstName(fn);
		setLastName(ln);
		setPayRate(pr);
		setHoursWorked(hw);
		responsibilities = new ArrayList<String>();  // composition
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		if (hoursWorked < 0) {
			this.hoursWorked = 0;
		} else {
			this.hoursWorked = hoursWorked;
		}
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		if (payRate < 0) {
			this.payRate = 0;
		} else {
			this.payRate = payRate;
		}
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%.2f\t%.2f\t%s",firstName,lastName,hoursWorked,payRate,
			getResponsibilitiesAsString());
	}

	public double calculateGrossPay() {
		return hoursWorked * payRate;
	}

	public void addResponsibility(String resp) {
		responsibilities.add(resp);
	}

	public String getResponsibilitiesAsString() {
		String result = "";
		for (String resp: responsibilities) {
			result = result + resp + ";";
		}
		return result;
	}

}
