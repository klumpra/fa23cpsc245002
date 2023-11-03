public class SalariedEmployee extends Employee {
    public SalariedEmployee() {
        this("","",0);
    }
    public SalariedEmployee(String firstName, String lastName, double rate) {
        super(firstName,lastName,rate);
    }
    @Override
    public String getType() {
        return "salaried employee";
    }
    @Override
    public double calculatePay() {
        return getPayRate();
    }
}
