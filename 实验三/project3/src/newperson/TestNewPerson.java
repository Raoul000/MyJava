package newperson;

public class TestNewPerson {

	public static void main(String[] args) {
		NewPerson newPerson1 = new NewPerson("Cindy", 20, "Female");
		System.out.println(newPerson1);
		NewPerson newPerson2 = new NewPerson("Jackson", 21);
		System.out.println(newPerson2);
		System.out.println("Ò»Äêºó£º");
		newPerson1.setAge(21);
		newPerson2.setAge(22);
		System.out.println(newPerson1);
		System.out.println(newPerson2);

	}

}
