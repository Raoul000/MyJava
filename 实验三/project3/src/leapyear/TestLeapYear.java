package leapyear;

import java.util.Scanner;

public class TestLeapYear {

	public static void main(String[] args) {
		LeapYear leapYear = new LeapYear();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.print(leapYear.isLeapYear(n));

	}

}
