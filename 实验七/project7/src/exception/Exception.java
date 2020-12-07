package exception;

import java.util.Arrays;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		double[] x = new double[3];
		double sum = 0.0;
		Scanner inputScan = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			try {
				System.out.println("Please input the " + (i + 1) + " number:");
				String input = inputScan.nextLine();
				x[i] = Double.parseDouble(input);
				sum += x[i];

			} catch (NumberFormatException e) {
				System.out.println("Please input the " + (i + 1) + " number:");
				String input = inputScan.nextLine();
				x[i] = Double.parseDouble(input);
				sum += x[i];
			}
		}
		System.out.println(Arrays.toString(x));
		System.out.println("Sum:" + sum);
	}

}
