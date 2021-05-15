import java.util.Scanner;

public class NumberIncrement {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		  System.out.println("Enter No : ");
			int n1 = scan.nextInt();
			int updatedValue = m1(n1);
		System.out.println(updatedValue);
	}
	
	public static int m1(int n1) {

		int n2=n1+1;
		return n2;
		
	}

}
