package person;

import java.awt.image.PixelGrabber;

public class Person {
	private String name;
	private String sex;
	private int age;

	public Person() {
		this.name = "";
		this.sex = "";
		this.age = 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSex(String sex) {
		if (sex != "Male" && sex != "Female") {
			System.out.println("Error!");
		}
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setAge(int age) {
		if (age < 0 && age > 100) {
			System.out.println("Error!");
		}
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}
