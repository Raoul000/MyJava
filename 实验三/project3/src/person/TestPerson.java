package person;

public class TestPerson {

	public static void main(String[] args) {
		System.out.printf("初始化前：");
		Person person = new Person();
		System.out.println(person);
		System.out.printf("测试数据：");
		person.setAge(20);
		person.setSex("Male");
		person.setName("Jack");
		System.out.println(person);
	}
}