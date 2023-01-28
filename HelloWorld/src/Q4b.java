import java.util.Scanner;

public class Q4b {
	public static void main(String[] args) {
			Scanner src = new Scanner(System.in);
			double totalArea;
			System.out.print ("Enter the width: ");
			double side1 = src.nextDouble();
			System.out.print ("Enter the length: ");
			double side2 = src.nextDouble();
			totalArea = side1 * side2;
			// Print output */
				System.out.println ("The total area of this rectangle is: " + totalArea + " m\u00B2");
				}
			}