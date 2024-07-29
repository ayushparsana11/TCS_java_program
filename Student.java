/*
 	Write a program to print the names of students by creating a Student class. 
 	If no name is passed while creating an object of Student class, 
 	then the name should be "Unknown", otherwise the name should be equal to the String value 
 	passed while creating object of Student class.
 */

package Day4;

public class Student {

	private String name;

	public Student()
	{
		this.name="Unknown";
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		this.name = name;
	}
	
}
