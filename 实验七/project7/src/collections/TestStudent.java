package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		// �������100��Student�������students����
		Student[] students = new Student[100];
		for (int i = 0; i < 100; i++)
			students[i] = new Student();

		// ��students����ת����studentList
		List<Student> list = new ArrayList<>();
		Collections.addAll(list, students);
		// ��������
		Collections.sort(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Student e1 = (Student) o1, e2 = (Student) o2;
				return e1.getGrade() - e2.getGrade();
			}
		});
		System.out.println("�����List��ǰ����ѧ����Ϣ:");
		for (int i = 0; i < 3; i++)
			System.out.println(list.get(i));
		System.out.println("�ɼ���ߵ�ѧ����Ϣ��");
		System.out.println(Collections.max(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Student e1 = (Student) o1, e2 = (Student) o2;
				return e1.getGrade() - e2.getGrade();
			}
		}));
		System.out.println("�ɼ���͵�ѧ����Ϣ:");
		System.out.println(Collections.min(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Student e1 = (Student) o1, e2 = (Student) o2;
				return e1.getGrade() - e2.getGrade();
			}
		}));
//		System.out.println("�ɼ�����60�ֵ�ѧ�����±�:");
		System.out.println(
				"�ɼ�����60�ֵ�ѧ�����±�:  " + Collections.binarySearch(list, new Student(60), new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						Student e1 = (Student) o1, e2 = (Student) o2;
						return e1.getGrade() - e2.getGrade();
					}
				}));
		List<Student> otherList = Student.studentList(list);
		list.removeAll(otherList);
		System.out.println(">60�ֵ�ѧ������:" + list.size() + "<60��ѧ������:" + otherList.size());
		// ����studentList��ѧ�����е�˳��
		Collections.shuffle(list);
		System.out.println("���Һ�List��ǰ����ѧ����Ϣ:");
		for (int i = 0; i < 3; i++)
			System.out.println(list.get(i));
	}
}
