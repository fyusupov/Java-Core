package LessonTwo;
import java.util.*;

public class Main {
	ArrayList<Person> list = new ArrayList<>();
	ArrayList<Project> projectsList = new ArrayList<>();
	public void fillPersonDate() {
		do {
			Person person=inputPerson();
			list.add(person);
		} while(KeyboardHelper.getRequest("Yana ma'lumot kiritasizmi?"));
	}
	public void show() {
		System.out.println("Kiritilgan ma'lumotlar ro'yhati:" + list);
	}
	public void edit() {
			int indexOfPerson= KeyboardHelper.getNumber("O'zgartiriladigan indeksni tanlang: ");
			Person person = list.get(indexOfPerson);
			System.out.println(person+" o'rniga yangi qiymat o'rnatish ");
			person = inputPerson();
			list.set(indexOfPerson, person);
			System.out.println(list);
	}
	public void delete() {
			int indexOfPeople = KeyboardHelper.getNumber("O'chiriladigan indeksni tanglang" );
			list.remove(indexOfPeople);
			System.out.println("Yangi ro'yhat" + list);
	}
	public Person inputPerson() {
		Person person = new Person();
		person.setName(KeyboardHelper.getText("Ismingizni kiriting: "));
		person.setLastName(KeyboardHelper.getText("Familiyangizni kiriting: "));
		person.setAge(KeyboardHelper.getNumber("Yoshingizni kiriting: "));
		if(person.getAge()<=0 || person.getAge()>130) {
			person.setAge(KeyboardHelper.getNumber("1 dan 100 gacha kiriting: "));
		}
			if(person.getAge() >= 18) {
				if(KeyboardHelper.getRequest("Uylanganmisiz?")){
					person.setNumbersOfChildren(KeyboardHelper.getNumber("Nechta farzandingiz bor?"));
				}
			}
		return person;
	}
	public Project inputProject() {
		Project project = new Project();
		project.setLoyihaID(KeyboardHelper.getNumber("Loyiha IDsini kiriting: "));
		project.setLoyihaNomi(KeyboardHelper.getText("Loyiha nomini kiriting: "));
		return project;
	}
	public void fillProjectDate() {
		do {
			Project project = inputProject();
			projectsList.add(project);
		}while(KeyboardHelper.getRequest("Yana loyiha kiritasizi?"));
	}
	public void addToProjectEmployee() {
		int indexOfProjects = KeyboardHelper.getNumber("Qaysi loyihaga xodim qo'shmoqchisiz? Loyiha indeksini tanlang:");
		Project project = projectsList.get(indexOfProjects);
		do{
			int indexOfPerson = KeyboardHelper.getNumber(projectsList.get(indexOfProjects)+ " loyihasiga qaysi xodimni qo'shmoqchisiz? Xodim indeksini tanlang.");
			Person person = list.get(indexOfPerson);
			project.personList.add(person);
			System.out.println(project.getLoyihaNomi()+" loyihasiga qo'shilgan xodimlar ro'yhati: "+project.personList);
			}while(KeyboardHelper.getRequest("Loyihaga yana xodim qo'shasizmi?"));
	}
	public void showEmployeeProject() {
		int indexOfPerson = KeyboardHelper.getNumber("Qaysi xodimni qaysi loyihalarda qatnashayotganini ko'rmoqchisiz? Xodim indeksini tanlang");
		Person person = list.get(indexOfPerson);
	}
	public static int mainMenu() {
		int returnValue=0;
		System.out.println("Menu\n1-Ma'lumotlarni kiritish\n2-Ro'yhatni ko'rish\n"
				+ "3-Ro'yhatni tahrirlash\n4-O'chirish\n5-Loyiha qo'shish\n6-Loyihaga xodim qo'shish\n0-Dasturdan chiqish");
		returnValue = KeyboardHelper.getNumber("Menu tartib raqamini tanlang: ");
		return returnValue;
	}
}
	