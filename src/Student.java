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

public class Student extends Person {
	// Instance fields
	private int gradYear;
	private String advisory;
	private int lockerNumber;
	
	// Default constructor
	public Student() {
		super();
	}
	
	// Parameter constructor
	public Student(int inGradYear, String inAdvisory, int inLockerNumber) {
		super();
		gradYear = inGradYear;
		advisory = inAdvisory;
		lockerNumber = inLockerNumber;
	}
	
	// Parameter constructor
	public Student(String inFirstName, String inLastName, int inAge, String inHouse,int inGradYear, String inAdvisory, int inLockerNumber) {
		super(inFirstName, inLastName, inAge, inHouse);
		gradYear = inGradYear;
		advisory = inAdvisory;
		lockerNumber = inLockerNumber;
	}
	
	// Accessor Methods
	public int getGradYear() {
		return gradYear;
	}
	
	public String getAdvisory() {
		return advisory;
	}
	
	public int getLockerNumber() {
		return lockerNumber;
	}
	
	// Mutator Methods
	public void setGradYear(int inGradYear) {
		gradYear = inGradYear;
	}
	
	public void setAdvisory(String inAdvisory) {
		advisory = inAdvisory;
	}
	
	public void setLockerNumber(int inLockerNumber) {
		lockerNumber = inLockerNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + super.getFirstName() + ", lastName=" + super.getLastName() + ", age=" + super.getAge() + ", house=" + super.getHouse() + "] Student [gradYear=" + gradYear + ", advisory=" + advisory + ", lockerNumber=" + lockerNumber + "]";
	}
	
}