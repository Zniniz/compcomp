
/* Purpose: This program calculates the final price of a
  purchase including a 15% sales tax */
import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double TAX_RATE = 0.15;
		double subtotal, tax, totalCost, unitPrice;
		System.out.print("Enter the quantity: ");
		int quantity = keyboard.nextInt();
		System.out.print("Enter the unit price: ");
		unitPrice = keyboard.nextDouble();
		subtotal = quantity * unitPrice;
		tax = subtotal * TAX_RATE;
		totalCost = subtotal + tax;
// Print output */
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Total: " + totalCost);
	}
}