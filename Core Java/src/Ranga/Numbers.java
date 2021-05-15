package Ranga;

public class Numbers {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + " * " + j + " = " + i * j);
				System.out.println("\t");
			}

			System.out.println();
		}
		for (int j = 1; j <= 10; j++) {
			System.out.print("1" + " * " + j + " = " + (1 * j));
			System.out.print("\t2" + " * " + j + " = " + (2 * j));
			System.out.print("\t3" + " * " + j + " = " + (3 * j));
			System.out.print("\t4" + " * " + j + " = " + (4 * j));
			System.out.print("\t5" + " * " + j + " = " + (5 * j));
			System.out.print("\t6" + " * " + j + " = " + (6 * j));
			System.out.println("\t");
		}
	}

}
