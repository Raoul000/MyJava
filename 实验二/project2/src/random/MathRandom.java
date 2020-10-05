package random;

import java.text.NumberFormat;
import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Randnum(n);
		Randchar(n);
	}

	public static void Randnum(int n) {

		int[] rand = new int[n];
		for (int i = 0; i < n; i++) {
			rand[i] = (int) (2000 + Math.random() * 1000);
		}

		double num1 = 0;
		for (int i : rand) {
			if (i > 2500) {
				num1++;
			}
		}
		double num2 = n - num1;
		double result1 = num1 / n * 100;
		double result2 = num2 / n * 100;
		System.out.printf("大于2500的百分比为:%.2f%%\n小于等于2500的百分比为:%.2f%%", result1, result2);
		System.out.println();

	}

	public static void Randchar(int n) {
		char[] rand1 = new char[n];
		double[] rand2 = new double[26];
		for (int i = 0; i < n; i++) {
			rand1[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 26; j++) {
				if (rand1[i] == 'a' + j) {
					rand2[j]++;
				}
			}
		}
		double[] result = new double[26];
		for (int i = 0; i < 26; i++) {
			result[i] = rand2[i] / n * 100;
		}
		System.out.println("从a-z的百分比分别为:");
		int cnt = 0;
		for (int i = 0; i < 26; i++) {
			System.out.printf("\t%.2f%%;", result[i]);
			cnt++;
			if (cnt == 7) {
				System.out.println();
				cnt = 0;
			}
		}

	}

}
