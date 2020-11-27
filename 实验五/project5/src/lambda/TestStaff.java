package lambda;

import java.time.LocalDate;
import java.util.Arrays;

public class TestStaff {

	public static void main(String[] args) {
		Staff[] staff = new Staff[5];
		staff[0] = new Staff("涛涛", "福州", 20, "Male", 5000, LocalDate.of(2005, 8, 21));
		staff[1] = new Staff("阿伟", "广东", 19, "Male", 2000, LocalDate.of(2011, 12, 01));
		staff[2] = new Teacher("李老师", "厦门", 35, "Male", 10000, LocalDate.of(2002, 3, 18), "计算机", " 软件", 5000);
		staff[3] = new Dean("浦老师", "厦门", 40, "Male", 20000, LocalDate.of(2006, 1, 05), "计算机", " 软件", 5000, 10000);
		staff[4] = new SecurityGuard("小晖", "北京", 22, "Male", 2000, LocalDate.of(2015, 9, 10), "拳击", 2000);
		System.out.println("所有Staff信息：");
		print(staff);
		System.out.println("每个人的名字：");
		printName(staff);
		sortBySalary(staff);
		System.out.println("薪资排序：");
		print(staff);
		printSalary(staff);
		sortByAge(staff);
		System.out.println("年龄排序：");
		print(staff);
		sortByName(staff);
		System.out.println("名字排序：");
		print(staff);
		sortByDateHired(staff);
		System.out.println("雇佣日期排序：");
		print(staff);
	}

	private static void print(Staff[] staffs) {
		for (Staff element : staffs) {
			System.out.println(element);
		}
	}

	private static void printName(Staff[] persons) {
		for (Staff element : persons) {
			System.out.println(element.getName());
		}
	}

	private static void printSalary(Staff[] staffs) {
		for (Staff element : staffs) {
			System.out.println("salary:" + element.getSalary());
		}
	}

	private static void sortBySalary(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> o2.getSalary() - o1.getSalary());
	}

	private static void sortByAge(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> o1.getAge() - o2.getAge());
	}

	private static void sortByName(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> o1.getName().compareTo(o2.getName()));
	}

	private static void sortByDateHired(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> o1.getDataHired().compareTo(o2.getDataHired()));
	}
}
