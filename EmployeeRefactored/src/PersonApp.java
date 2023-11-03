
import java.util.ArrayList;
public class PersonApp {
	public static void main(String[] args) {
		HourlyEmployee emp1 = new HourlyEmployee("Brody","Klump",15,25.25);
		SalariedEmployee emp2 = new SalariedEmployee("Ray","Klump",2500);
		emp1.getPaid();
		emp2.getPaid();
		Customer cus = new Customer("Ray","Klump","123 Hollywood Lane",60000);
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(emp1);
		persons.add(emp2);
		persons.add(cus);
		for (Person p : persons) {
			System.out.println(p);
		}
	}
}
