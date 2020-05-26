package LessonTwo;
import java.util.*;

public class KeyboardHelper {
	public static int getNumber(String message) {
		System.out.println(message);
		int returnValue = 0;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			try {
				returnValue=scanner.nextInt();
				break;
		} 
			catch (InputMismatchException e) {
				System.out.println("0 dan 100 gacha kiriting: ");
				continue;	
		}
	} 
	return returnValue; 
	}
	public static String getText(String message) {
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		String consoleInput=scanner.next();
		return consoleInput;
	}
	public static boolean getRequest(String message) {
		System.out.println(message);
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String consoleInput = scanner.next();
			if(consoleInput.equalsIgnoreCase("ha")) {
				return true;
			} 
			else if(consoleInput.equalsIgnoreCase("yo'q")) {
				return false;
			}
			else {
				System.out.println("Ha yoki yo'qni kiriting: ");
			}
		}
	}
}
