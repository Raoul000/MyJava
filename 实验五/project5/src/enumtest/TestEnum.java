package enumtest;

public class TestEnum {

	public static void main(String[] args) {
		City[] city = City.values();
		for (City C : city) {
			System.out.println("���У�" + C + " ��������" + C.getName());
		}
		System.out.println();
		University[] university = University.values();
		for (University U : university) {
			System.out.println("��ѧ��" + U + " ��������" + U.getName() + " ���ڳ���:" + U.getCity());
		}
	}
}
