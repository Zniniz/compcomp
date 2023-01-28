import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in); // next{Type}(): InputStream(System.in) → Keyboard //next{Type}(): reads
												// buffer of InputStream(System.in)
		System.out.print("Enter your age & weight: ");
		int age = src.nextInt(); // IN: 25
		double weight = src.nextDouble(); // IN: 88.50 Bona System.out.print("Enter your name: ");
		
		System.out.print("Enter full name: ");
		String name = src.nextLine(); // No user prompt!! // OUT: age = 25; weight = 88.50; name = Bona?
		
		src.close();
		
		System.out.println("age: "+ age);
		System.out.println("weight: " + weight);
		System.out.println("name: " + name);
	}

}
