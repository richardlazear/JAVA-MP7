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

public class MP7 {
	public static void main(String[] args) {
		// Person 1
		Person person1 = new Person();
		person1.setFirstName("Richie");
		person1.setLastName("Lazear");
		person1.setAge(18);
		person1.setHouse("Hoodwink");
		
		System.out.println(person1.toString());
		// End Person 1
		
		// Person 2
		Student person2 = new Student(2015, "Bahr", 333);
		System.out.println(person2.toString());
		
		person2.setFirstName("Julian");
		person2.setLastName("Henry");
		person2.setAge(18);
		person2.setHouse("Taub");
		System.out.println(person2.toString());
		// End Person 2
		
		// Person 3
		Teacher person3 = new Teacher("Jeff", "Ritter", 29, "Chidsey", "Computer Science", 10, 1000000);
		System.out.println(person3.toString());
		// End Person 3
	}
}