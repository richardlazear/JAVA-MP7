/******************************************************************************************************
Build a Person class that Student and Teacher class inherit.  All 3 classes need:
3 instance fields each
3 accessor methods each
3 mutator methods each
A default constructor
2 parameter constructors each

The 4th file you need is a tester that test all aspects
of the inheritance to make sure it all works together.
*******************************************************************************************************/

public class Person {
	// Instance fields
	private String firstName;
	private String lastName;
	private int age;
	private String house;
	
	// Default constructor
	public Person() {
		
	}
	
	// Parameter constructor
	public Person(String inFirstName, String inLastName) {
		firstName = inFirstName;
		lastName = inLastName;
	}
	
	// Parameter constructor
	public Person(String inFirstName, String inLastName, int inAge, String inHouse) {
		firstName = inFirstName;
		lastName = inLastName;
		age = inAge;
		house = inHouse;
	}
	
	// Acccessor Methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getHouse() {
		return house;
	}
	
	// Mutator Methods
	public void setFirstName(String inFirstName) {
		firstName = inFirstName;
	}
	
	public void setLastName(String inLastName) {
		lastName = inLastName;
	}
	
	public void setAge(int inAge) {
		age = inAge;
	}
	
	public void setHouse(String inHouse) {
		house = inHouse;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", house=" + house + "]";
	}
}
