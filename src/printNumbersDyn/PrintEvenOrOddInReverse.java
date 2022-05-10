package printNumbersDyn;

import java.util.Scanner;

public class PrintEvenOrOddInReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("From number: ");
		int i = sc.nextInt();
		System.out.println("To number: ");
		int j = sc.nextInt();

		System.out.println("Even or Odd: ");
		String S = sc.next();
		System.out.println("you choose : " + S);

		if (S.equals("even")) {

			System.out.println("Even numbers: ");

			for (int a = j; a >= i; a--) {
				if (a % 2 == 0) {
					System.out.println(a);

				}

			}
		} else {
			System.out.println("Odd numbers: ");
			for (int a = j; a >= i; a--) {

				if (a % 2 != 0) {
					System.out.println(a);

				}
			}
		}
	}

}
