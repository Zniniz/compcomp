import java.util.Scanner;

public class goofyness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter one numeronym:");
		String num = in.next();
		System.out.print("The new word created is: {");

		
		for (int i = num.length() - 1; i >= 0; i--) {
			System.out.print(num.charAt(i));
			System.out.print(num.charAt(i));
		}
		
		System.out.print("}");
		System.out.println("\nSuberb!");
	}

}
