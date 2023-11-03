// will be the superclass for Employee and Customer
public abstract class Person {
	private String firstName;
	private String lastName;
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
	public Person() {
		this("","");
	}
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", getType(), firstName, lastName);
	}
	public abstract String getType();
}
