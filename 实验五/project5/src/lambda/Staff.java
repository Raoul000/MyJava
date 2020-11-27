package lambda;

import java.time.LocalDate;

public class Staff {
	private String name;
	private String address;
	private int age;
	private String sex;
	private int salary;
	private LocalDate dataHired;

	public Staff(String name, String address, int age, String sex, int salary, LocalDate dataHired) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.dataHired = dataHired;
	}

	public Staff() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getDataHired() {
		return dataHired;
	}

	public void setDataHired(LocalDate dataHired) {
		this.dataHired = dataHired;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + ", age=" + age + ", sex=" + sex + ", salary=" + salary
				+ ", dataHired=" + dataHired + "]";
	}

}
