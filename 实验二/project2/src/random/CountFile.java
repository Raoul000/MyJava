package random;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(
				"D:\\eclipse-jee-2020-06-R-win32-x86_64\\eclipse\\eclipse-workspace\\project2\\src\\random\\Object.txt"));
		double totl = 0; // 总字符数
		int[] cnt = new int[26];
		int num = 0;
		while (in.hasNextLine()) {
			String line = in.nextLine();
			char[] temp = line.toCharArray();
			for (char x : temp) {
				for (int i = 0; i < cnt.length; i++) {
					if (x == 'a' + i || x == 'A' + i) {
						cnt[i]++;
					}
				}
			}
			totl += temp.length;
		}
		System.out.println("Object文档中a~z出现的频率:");
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				double result = cnt[i] / totl;
				System.out.printf("\t%c = %.2f%%", 'a' + i, result * 100);
				num++;
				if (num == 7) {
					System.out.println();
					num = 0;
				}
			}
		}
	}

}
