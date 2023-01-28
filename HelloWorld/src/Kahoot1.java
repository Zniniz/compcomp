import java.util.Scanner;

public class Kahoot1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your last three test scores:  ");

		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		double average = (s1 + s2 + s3) / 3;
		System.out.print("Average: ");
		System.out.print(average);

	}
}