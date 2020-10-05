package string;

import java.util.Arrays;
import java.util.Scanner;

public class GetBirthDate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] result = new String[10];
		String[] id = new String[10];
		for (int i = 0; i < 10; i++) {
			id[i] = in.nextLine();
		}
		for (int j = 0; j < 10; j++) {
			result[j] = getBirthDate(id[j]);
		}
		Arrays.sort(result);
		System.out.println();
		System.out.println("出生年-月-日");
		for (String a : result) {
			System.out.println(a);
		}
	}

	public static String getBirthDate(String id) {
		id = id.substring(6, 10) + '-' + id.substring(10, 12) + '-' + id.substring(12, 14);
		return id;
	}

}
