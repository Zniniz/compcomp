import java.util.Scanner;

public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double price = 45678.678;
		int var2 = 57687;
		System.out.printf("%-10s%10.2f", price, var2);
	}

}
