package person;

public class TestPerson {

	public static void main(String[] args) {
		System.out.printf("��ʼ��ǰ��");
		Person person = new Person();
		System.out.println(person);
		System.out.printf("�������ݣ�");
		person.setAge(20);
		person.setSex("Male");
		person.setName("Jack");
		System.out.println(person);
	}
}