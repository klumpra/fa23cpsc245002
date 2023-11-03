
import java.util.ArrayList;
public abstract class Employee extends Person implements Payable {
	// I already have private firstName and lastName that I inherited + get, set, constructors, toString
	// I cannot directly access firstName and lastName b/c private to Person
	private double payRate;
	private ArrayList<String> responsibilities;
    private double totalPay;
    public double getTotalPay() {
        return totalPay;
    }
    public void setTotalPay(double totalPay) {
        if (totalPay < 0) {
            this.totalPay = 0;
        } else {
            this.totalPay = totalPay;
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
    public Employee() {
    	this("","",0);
    }
    public Employee(String firstName, String lastName, double rate) {
    	super(firstName,lastName);
    	setPayRate(rate);
    	responsibilities = new ArrayList<String>();
        totalPay = 0;
    }
    public void addResponsibility(String responsibility) {
        responsibilities.add(responsibility);
    }
    public String getResponsibilitiesAsString() {
        String result = "";
        for (String resp : responsibilities) {
            result = result + resp + "; ";
        }
        return result;
    }
    @Override
    public String toString() {
    	return String.format("%s\t%.2f\t%s\t%.2f", super.toString(), payRate, 
            getResponsibilitiesAsString(),totalPay);
    }
    @Override
    public String getType() {
        return "employee";
    }
    @Override
    public void getPaid() {
        totalPay = totalPay + calculatePay();
    }
}

