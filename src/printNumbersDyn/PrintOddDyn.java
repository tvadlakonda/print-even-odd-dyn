package printNumbersDyn;

import java.util.Scanner;

public class PrintOddDyn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("From number: ");
		int i = sc.nextInt();
		System.out.println("To number: ");
		int j = sc.nextInt();

		// System.out.println("Even or Odd: ");
		// String S = sc.next();

		for (int a = i; a <= j; a++) {

			if (a % 2 != 0)
				System.out.println(a);

		}
	}
}
