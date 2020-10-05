package project1;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("∑«µ›πÈÀ„∑®£∫" + gcd(n1, n2));
		System.out.println("µ›πÈÀ„∑®£∫" + gcd_recursive(n1, n2));
	}

	private static int gcd(int m, int n) {
		int temp;
		temp = m % n;
		while (temp != 0) {
			m = n;
			n = temp;
			temp = m % n;
		}
		return n;
	}

	private static int gcd_recursive(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return gcd_recursive(n, m % n);
		}
	}

}
