package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int grade;

	Student() {
		this.grade = (int) (Math.random() * 100);
		this.name = String.valueOf((char) ('a' + Math.random() * ('z' - 'a' + 1)));
		this.age = (int) (Math.random() * 100);
	}

	Student(String name, int age, int grade) {
		this.age = age;
		this.name = name;
		this.grade = grade;
	}

	public Student(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public static List<Student> studentList(List list) {
		ListIterator<Student> it = list.listIterator();
		List<Student> studentList = new ArrayList<>();
		while (it.hasNext()) {
			Student tmp = it.next();
			if (tmp.getGrade() < 60)
				studentList.add(tmp);
		}
		return studentList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

}
