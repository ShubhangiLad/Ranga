import java.util.Scanner;

public class Calculator {
	static {
		System.out.println("Calculator Program");
	}
	static Scanner scan = new Scanner(System.in);
	static int a;
	static int b;
	static int option;

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			System.out.println("Please enter operations to be performed");
			System.out.println("1 : " + "Addition");
			System.out.println("2 : " + "Subtraction");
			System.out.println("3 : " + "Multiplication");
			System.out.println("4 : " + "Division");
			System.out.println("5 : " + "Exit");
			
			System.out.println("Enter your option");

			option = scan.nextInt();

			

			switch (option) {
			case 1:
				getUserInput();
				Addition();
				break;
			case 2:
				getUserInput();
				Subtraction();
				break;
			case 3:
				getUserInput();
				Multiplication();
				break;
			case 4:
				getUserInput();
				Division();
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Invalid Search");
				break;
			}
		}
	}

	public static void getUserInput() {
		System.out.println("Enter 1st no : ");
		a = scan.nextInt();
		System.out.println("Enter 2nd no : ");
		b = scan.nextInt();
	}

	public static void Addition() {
		int sum = (a + b);
		System.out.println("Result is " + sum);
	}

	private static void Subtraction() {
		int sub = (a - b);
		System.out.println("Result is " + sub);
	}

	private static void Multiplication() {
		int mul = (a * b);
		System.out.println("Result is " + mul);
	}

	private static void Division() {
		int div = (a / b);
		System.out.println("Result is " + div);
	}

}
