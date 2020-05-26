package LessonTwo;

public class Menu {
	public static void main(String[] args) {
		Main mainObject = new Main();
		while(true) {
			switch(Main.mainMenu()) {
				case 1:{
					mainObject.fillPersonDate();
					break;
				}
				case 2:{
					mainObject.show();
					break;
				}
				case 3:{
					mainObject.edit();	
					break;
				}
				case 4:{
					mainObject.delete();
					break;
				}
				case 5:{
					mainObject.fillProjectDate();
					break;
				}
				case 6:{
					mainObject.addToProjectEmployee();
					break;
				}
				case 0:{
					return;
				}
				default: {
					System.out.println("Menu bandlaridan bittasini kiriting:");
				}
			}
		}
	}
}