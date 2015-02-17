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

public class Teacher extends Person {
	// Instance fields
	private String subject;
	private int yrsOfService;
	private double salary;
	
	// Default constructor
	public Teacher() {
		super();
	}
	
	// Parameter constructor
	public Teacher(String inSubject, int inYrsOfService, double inSalary) {
		super();
		subject = inSubject;
		yrsOfService = inYrsOfService;
		salary = inSalary;
	}
	
	// Parameter constructor
	public Teacher(String inFirstName, String inLastName, int inAge, String inHouse, String inSubject, int inYrsOfService, double inSalary) {
		super(inFirstName, inLastName, inAge, inHouse);
		subject = inSubject;
		yrsOfService = inYrsOfService;
		salary = inSalary;
	}
	
	// Accessor Methods
	public String getSubject() {
		return subject;
	}
	
	public int getYrsOfService() {
		return yrsOfService;
	}
	
	public double getSalary() {
		return salary;
	}
	
	// Mutator Methods
	public void setSubject(String inSubject) {
		subject = inSubject;
	}
	
	public void setYrsOfService(int inYrsOfService) {
		yrsOfService = inYrsOfService;
	}
	
	public void setSalary(double inSalary) {
		salary = inSalary;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + super.getFirstName() + ", lastName=" + super.getLastName() + ", age=" + super.getAge() + ", house=" + super.getHouse() + "] Teacher [subject=" + subject + ", yrsOfService=" + yrsOfService + ", salary=" + salary + "]";
	}
	
}