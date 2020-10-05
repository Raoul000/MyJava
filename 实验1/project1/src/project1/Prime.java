package project1;

import java.util.Scanner;

public class Prime {
	public static void printPrimeNumbers(int[] n) {
		System.out.print("The prime numbers are ");
		int i = 0;
		for (; i < n.length - 1; i++) {
			System.out.print(n[i] + ",");
		}
		System.out.print(n[i]);
	}

	public static int[] getPrimeNumbers(int n) {

		int[] result = new int[n];
		int temp = 0;
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (result[i] == 0) {
				for (int j = i * i; j < n; j += i) {
					result[j] = 1;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0)
				temp++;
		}
		int[] tmp = new int[temp];
		for (int i = 0, j = 0; i < result.length && j < temp; i++) {
			if (result[i] == 0) {
				tmp[j] = i;
				j++;
			}
		}
		result = tmp;
		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("n = ");
		int n = in.nextInt();
		printPrimeNumbers(getPrimeNumbers(n));
	}
}
