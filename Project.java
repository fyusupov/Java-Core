package LessonTwo;

import java.util.ArrayList;

public class Project {
	ArrayList<Person> personList = new ArrayList<>();
	private int loyihaID;
	private String loyihaNomi;
	public int getLoyihaID() {
		return loyihaID;
	}
	public void setLoyihaID(int loyihaID) {
		this.loyihaID = loyihaID;
	}
	public String getLoyihaNomi() {
		return loyihaNomi;
	}
	public void setLoyihaNomi(String loyihaNomi) {
		this.loyihaNomi = loyihaNomi;
	}
	@Override
	public String toString() {
		return loyihaID +" "+loyihaNomi;
	}
}

