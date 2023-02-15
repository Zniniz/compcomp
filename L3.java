import java.util.Scanner;

public class L3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter two words:");
		String s1 = src.nextLine();
		String s2 = src.nextLine();
		//
		if (s1.length() % 3 == 0 && s1.length() % 5 != 0 && s2.length() % 3 == 0 && s2.length() % 5 != 0) {
		
			System.out.println("\nYour mystery word is " + s1.charAt(0) + s2.charAt(s2.length()-1) + "9876");
		//
		} else if (s1.length() % 3 != 0 && s1.length() % 5 == 0 && s2.length() % 3 != 0	&& s2.length() % 5 == 0) {
			
			System.out.println("\nYour mystery word is " + s2.charAt(0) + s1.charAt(s1.length() - 1) + "5432");
		//
		} else if (s1.length() % 3 == 0 && s1.length() % 5 == 0 && s2.length() % 3 == 0	&& s2.length() % 5 == 0) {
			
			System.out.println("\nYour mystery word is " + s1.charAt(1) + s2.charAt(1) + "3210");
		//
		} else {
			System.out.println("\nYour mystery word is " + "[" + s1.charAt(0) + s1.charAt(1) + s2.charAt(0) + s2.charAt(1) + "]");
		}src.close();
	}

}
