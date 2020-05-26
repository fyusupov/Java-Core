package LessonTwo;

import java.util.ArrayList;

public class Person {
	ArrayList<Project> projectList = new ArrayList<>();
	private String name;
	private String lastName;
	private int age;
	private int numbersOfChildren;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumbersOfChildren() {
		return numbersOfChildren;
	}
	public void setNumbersOfChildren(int numbersOfChildren) {
		this.numbersOfChildren = numbersOfChildren;
	}
	public Person() {

	}
	@Override
	public String toString() {
		return name+" "+lastName+" "+age+" "+numbersOfChildren;
	}
	
}
