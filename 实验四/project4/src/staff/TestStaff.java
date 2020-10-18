package staff;

import java.util.Date;

public class TestStaff {

	public static void main(String[] args) {
		Staff[] staff = new Staff[5];
		staff[0] = new Staff("����", "����", 20, "Male", 5000, new Date());
		staff[1] = new Staff("��ΰ", "�㶫", 19, "Male", 2000, new Date());
		staff[2] = new Teacher("����ʦ", "����", 35, "Male", 10000, new Date(), "�����", " ���", 5000);
		staff[3] = new Dean("����ʦ", "����", 40, "Male", 20000, new Date(), "�����", " ���", 5000, 10000);
		staff[4] = new SecurityGuard("С��", "����", 22, "Male", 2000, new Date(), "ȭ��", 2000);
		System.out.println("����Staff��Ϣ��");
		print(staff);
		System.out.println("ÿ���˵����֣�");
		printName(staff);
		sortBySalary(staff);
		System.out.println("н������");
		print(staff);
		printSalary(staff);
		sortByAge(staff);
		System.out.println("��������");
		print(staff);
		sortByName(staff);
		System.out.println("��������");
		print(staff);
		sortByDateHired(staff);
		System.out.println("��Ӷ��������");
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
		for (int i = 0; i < staffs.length; i++) {
			for (int j = 0; j < staffs.length - 1; j++) {
				if (staffs[j].getSalary() < staffs[j + 1].getSalary()) {
					Staff tmp = staffs[j];
					staffs[j] = staffs[j + 1];
					staffs[j + 1] = tmp;
				}
			}
		}
	}

	private static void sortByAge(Staff[] staffs) {
		for (int i = 0; i < staffs.length; i++) {
			for (int j = 0; j < staffs.length - 1; j++) {
				if (staffs[j].getAge() > staffs[j + 1].getAge()) {
					Staff tmp = staffs[j];
					staffs[j] = staffs[j + 1];
					staffs[j + 1] = tmp;
				}
			}
		}
	}

	private static void sortByName(Staff[] staffs) {
		for (int i = 0; i < staffs.length; i++) {
			for (int j = 0; j < staffs.length - 1; j++) {
				if (staffs[j].getName().compareTo(staffs[j + 1].getName()) > 1) {
					Staff tmp = staffs[j];
					staffs[j] = staffs[j + 1];
					staffs[j + 1] = tmp;
				}
			}
		}
	}

	private static void sortByDateHired(Staff[] staffs) {
		for (int i = 0; i < staffs.length; i++) {
			for (int j = 0; j < staffs.length - 1; j++) {
				if (staffs[j].getDataHired().compareTo(staffs[j + 1].getDataHired()) > 0) {
					Staff tmp = staffs[j];
					staffs[j] = staffs[j + 1];
					staffs[j + 1] = tmp;
				}
			}
		}
	}
}
