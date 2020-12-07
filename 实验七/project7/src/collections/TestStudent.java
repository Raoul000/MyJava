package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		// 随机生成100个Student对象放入students数组
		Student[] students = new Student[100];
		for (int i = 0; i < 100; i++)
			students[i] = new Student();

		// 将students数组转换成studentList
		List<Student> list = new ArrayList<>();
		Collections.addAll(list, students);
		// 进行排序
		Collections.sort(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Student e1 = (Student) o1, e2 = (Student) o2;
				return e1.getGrade() - e2.getGrade();
			}
		});
		System.out.println("排序后List中前三个学生信息:");
		for (int i = 0; i < 3; i++)
			System.out.println(list.get(i));
		System.out.println("成绩最高的学生信息：");
		System.out.println(Collections.max(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Student e1 = (Student) o1, e2 = (Student) o2;
				return e1.getGrade() - e2.getGrade();
			}
		}));
		System.out.println("成绩最低的学生信息:");
		System.out.println(Collections.min(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Student e1 = (Student) o1, e2 = (Student) o2;
				return e1.getGrade() - e2.getGrade();
			}
		}));
//		System.out.println("成绩等于60分的学生的下标:");
		System.out.println(
				"成绩等于60分的学生的下标:  " + Collections.binarySearch(list, new Student(60), new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						Student e1 = (Student) o1, e2 = (Student) o2;
						return e1.getGrade() - e2.getGrade();
					}
				}));
		List<Student> otherList = Student.studentList(list);
		list.removeAll(otherList);
		System.out.println(">60分的学生人数:" + list.size() + "<60的学生人数:" + otherList.size());
		// 打乱studentList中学生排列的顺序
		Collections.shuffle(list);
		System.out.println("打乱后List中前三个学生信息:");
		for (int i = 0; i < 3; i++)
			System.out.println(list.get(i));
	}
}
