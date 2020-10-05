package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TheScanner {

	public static void main(String[] args) throws FileNotFoundException {
		birthFile();
		measure();
		high();
		for (String tmp : findStudent("����1")) {
			System.out.println(tmp);
		}
	}

	public static void birthFile() throws FileNotFoundException {
		// д���ļ���ʾ
		PrintWriter out = new PrintWriter("myfile.txt");
		out.println("���� ���� Java ���ݽṹ ƽ���ɼ� �ܳɼ�");
		for (int i = 0; i < 10000; i++) {
			CreatStudent student = new CreatStudent(1);
			out.println(student.getName() + " " + student.getMath() + " " + student.getJava() + " " + student.getDs()
					+ " " + student.getAverage() + " " + student.getTotal());
		}
		out.close();
	}

	public static void measure() throws FileNotFoundException {
		Scanner in = new Scanner(new File("myfile.txt"));
		in.nextLine();
		PrintWriter out = new PrintWriter("tmp.txt");
		out.println("���� ���� Java ���ݽṹ ƽ���ɼ� �ܳɼ�");
		while (in.hasNextLine()) {
			String line = in.nextLine();
			Scanner lineScanner = new Scanner(line);
			lineScanner.useDelimiter(" ");
			CreatStudent student = new CreatStudent();
			student.setStudent(lineScanner.next(), Integer.valueOf(lineScanner.next()),
					Integer.valueOf(lineScanner.next()), Integer.valueOf(lineScanner.next()));
			student.measure();
			out.println(student.getName() + " " + student.getMath() + " " + student.getJava() + " " + student.getDs()
					+ " " + student.getAverage() + " " + student.getTotal());
		}
		in.close();
		out.close();
		File del = new File("myfile.txt");
		del.delete();
		File oldName = new File("tmp.txt");
		File newName = new File("myfile.txt");
		oldName.renameTo(newName);

	}

	public static void high() throws FileNotFoundException {
		CreatStudent[] students = new CreatStudent[10000];
		for (int i = 0; i < 10000; i++) {
			students[i] = new CreatStudent();
		}
		CreatStudent student = new CreatStudent();
		Scanner in = new Scanner(new File("myfile.txt"));// Ϊmyfile.txt���File����һ��ɨ����in
		in.nextLine();
		int k = 0;
		while (in.hasNextLine()) {// �ж�ɨ�����Ƿ�����һ��δ��ȡ����ѭ�����ļ���ÿһ�ж�����
			String line = in.nextLine();// ����myfile.txt����һ��
			Scanner lineScanner = new Scanner(line);// ��ÿһ�е����ݽ���һ��ɨ����
			lineScanner.useDelimiter(" ");// ʹ�ÿո���Ϊ�ָ���
			students[k++].setStudent(lineScanner.next(), Integer.valueOf(lineScanner.next()),
					Integer.valueOf(lineScanner.next()), Integer.valueOf(lineScanner.next()),
					Integer.valueOf(lineScanner.next()), Integer.valueOf(lineScanner.next()));
		}
		Arrays.sort(students, new Comparator<CreatStudent>() {
			@Override
			public int compare(CreatStudent o1, CreatStudent o2) {
				if (o1.getAverage() == o2.getAverage())
					return 0;
				else
					return o1.getAverage() > o2.getAverage() ? -1 : 1;
			}
		});
		in.close();// ������ϣ������Ҫ�������close��
		PrintWriter out = new PrintWriter("first_10.txt");
		out.println("���� ���� Java ���ݽṹ ƽ���ɼ� �ܳɼ�");
		for (int i = 0; i < 10; i++)
			out.println(students[i].getName() + " " + students[i].getMath() + " " + students[i].getJava() + " "
					+ students[i].getDs() + " " + students[i].getAverage() + " " + students[i].getTotal());
		out.close();
	}

	public static String[] findStudent(String name) throws FileNotFoundException {
		ArrayList<String> students = new ArrayList<String>();
		int k = 0;
		Scanner in = new Scanner(new File("myfile.txt"));// Ϊmyfile.txt���File����һ��ɨ����in
		in.nextLine();
		while (in.hasNextLine()) {// �ж�ɨ�����Ƿ�����һ��δ��ȡ����ѭ�����ļ���ÿһ�ж�����
			String line = in.nextLine();// ����myfile.txt����һ��
			Scanner lineScanner = new Scanner(line);// ��ÿһ�е����ݽ���һ��ɨ����
			lineScanner.useDelimiter(" ");// ʹ�ÿո���Ϊ�ָ���
			if (lineScanner.next().equals(name)) {
				students.add(line);
				k++;
			}
		}
		in.close();// ������ϣ������Ҫ�������close��
		String[] std = new String[k];
		for (int i = 0; i < k; i++) {
			std[i] = students.get(i);
		}
		return std;
	}

}