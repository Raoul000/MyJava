package newperson;

public class NewPerson {
	private String name;
	private String sex;
	private int age;
	private int id;
	private static int count=1;

	public NewPerson(String name, int age) {
		this.name = name;
		this.age = age;
		this.sex = "Male";
		this.id = count++;
	}

	public NewPerson(String name, int age, String sex) {
		this(name, age);
		this.setSex(sex);
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", sex=" + sex + ", age=" + age + ", id=" + id + "]";
	}

}
