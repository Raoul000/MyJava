package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Student {
	private String name;
	private int math;
	private int java;
	private int ds;
	private int avg;
	private int total;

	public Student(String name, int math, int java, int ds) {
		this.name = name;
		this.math = math;
		this.java = java;
		this.ds = ds;
	}

	public Student(String name, int math, int java, int ds, int avg, int total) {
		this.name = name;
		this.math = math;
		this.java = java;
		this.ds = ds;
		this.avg = avg;
		this.total = total;
	}

	private void Result() {
		total = math + java + ds;
		avg = total / 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDs() {
		return ds;
	}

	public void setDs(int ds) {
		this.ds = ds;
	}

	public int getAvg() {
		Result();
		return avg;
	}

	public void setAvg(int avg) {
		Result();
		this.avg = avg;
	}

	public int getTotal() {
		Result();
		return total;
	}

	public void setTotal(int total) {
		Result();
		this.total = total;
	}

	public static Student[] readStudentsFromFile(String fileName) throws FileNotFoundException {
		ArrayList<Student> students = new ArrayList<>();
		Scanner in = new Scanner(new File("Students.txt"));
		in.nextLine();
		while (in.hasNextLine()) {
			String line = in.nextLine();
			Scanner lineScanner = new Scanner(line);
			lineScanner.useDelimiter(" ");
			students.add(new Student(lineScanner.next(), Integer.valueOf(lineScanner.next()),
					Integer.valueOf(lineScanner.next()), Integer.valueOf(lineScanner.next()),
					Integer.valueOf(lineScanner.next()), Integer.valueOf(lineScanner.next())));
		}

		in.close();
		Student[] temp = students.toArray(new Student[students.size()]);
		return temp;
	}

	public static void studentSort(Student[] stu) {
		for (int j = 0; j < stu.length; j++) {
			for (int k = 0; k < stu.length - 1; k++) {
				if (stu[k].total < stu[k + 1].total) {
					Student temp = stu[k];
					stu[k] = stu[k + 1];
					stu[k + 1] = temp;
				}
			}
		}
		for (int i = 0; i < stu.length; i++)
			System.out.println(stu[i]);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", math=" + math + ", java=" + java + ", ds=" + ds + ", avg=" + avg
				+ ", total=" + total + "]";
	}

}
