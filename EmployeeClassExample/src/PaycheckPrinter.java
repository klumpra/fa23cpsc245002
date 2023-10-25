import java.util.ArrayList;
/**
 * This view class presents paychecks for a list of employees
 */
public class PaycheckPrinter {
    private double taxRate;
    public double getTaxRate() {
        return taxRate;
    }
    public void setTaxRate(double taxRate) {
        if (taxRate < 0) {
            this.taxRate = 0;
        } else {
            this.taxRate = taxRate;
        }
    }
    public PaycheckPrinter() {
        taxRate = 0.1;
    }
    public PaycheckPrinter(double taxRate) {
        setTaxRate(taxRate);
    }
    public void printPaychecks(ArrayList<Employee> emps) {
        double gross,net,taxes;
        for (Employee emp : emps) {
            gross = emp.calculateGrossPay();
            taxes = taxRate * gross;
            net = gross - taxes;
            System.out.printf("Pay employee %s %s the amount of $%.2f\n", emp.getFirstName(), 
                emp.getLastName(),net);
        }
    }
}