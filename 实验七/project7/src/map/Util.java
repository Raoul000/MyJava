package map;

import java.util.*;

public class Util {

	{
		System.out.println("-----Loding-----");
	}

	// �������n��ѧ�����б�
	public static List<Student> getRandomStudents(int n) {
		List<Student> stu = new ArrayList<Student>();
		ListIterator<Student> lt = stu.listIterator();
		while (lt.nextIndex() != n) {
			Student e = new Student();
			e.setName(Util.getRandomName(0, 10));
			e.setAge(Util.getRandomAge(0, 100));
			lt.add(e);
		}

		return stu;
	}

	// ����studentMap
	public static Map<String, Student> makeStudentMap(List<Student> stuList) {
		Map<String, Student> stuMap = new HashMap<>();
		for (Student s : stuList) {
			stuMap.put(s.getName(), s);
		}
		return stuMap;
	}

	// �����ֲ�ѯ
	public static String searchName(List<String> nameList, String name) {
		ListIterator<String> lt = nameList.listIterator();

		while (lt.hasNext()) {
			if (lt.next().equals(name)) {
				return name;
			}
		}
		System.out.println("Not Find(nameList)");
		return null;
	}

	// Map�и������ֲ���ѧ��
	public static Student searchStudent(Map<String, Student> stuMap, String name) {
		if (stuMap.containsKey(name)) {
			return stuMap.get(name);
		}
		System.out.println("Not Find(stuMap)");
		return null;
	}

	// NameList
	public static List<String> generateNameList(int n) {
		List<String> nameList = new ArrayList<String>();
		ListIterator<String> lt = nameList.listIterator();

		while (lt.nextIndex() != n) {
			lt.add(Util.getRandomName(0, 10));
		}

		return nameList;
	}

	// ����StudentMap
	public static Map<String, Student> generateStudentMap(int n) {
		List<Student> stuList = getRandomStudents(n);
		Map stuMap = makeStudentMap(stuList);
		return stuMap;
	}

	// �������StudentMapǰ10����key��ǰ10��value��ǰ10��entry
	public static void printStudentMap(Map<String, Student> stuMap) {
		int i = 0;
		for (Map.Entry<String, Student> e : stuMap.entrySet()) {
			if (i < 10) {
				System.out.println("Map<" + i + "> : ");
				System.out.println("Key: " + e.getKey() + "\nValue: " + e.getValue());
				System.out.println("Entry<k, v>: " + e);
				System.out.println("--------------------------------------------------");
			} else {
				break;
			}
			i++;
		}
	}

	// ��������
	// ���س�����min��max֮���������
	public static String getRandomName(int min, int max) {

		StringBuffer sb = new StringBuffer();
		char res = 0;

		for (int i = min; i < max; i++) {
			if (i == min) {
				res = (char) ('A' + (Math.random() * ('Z' - 'A' + 1)));
				sb.append(res);
			} else {
				res = (char) ('a' + (Math.random() * ('z' - 'a' + 1)));
				sb.append(res);
			}
		}

		return sb.toString();
	}

	// ���س�����min��max֮���������
	public static int getRandomAge(int min, int max) {
		// TODO Auto-generated method stub
		int age = (int) (min + Math.random() * (max - min));
		return age;
	}

}
