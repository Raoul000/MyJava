package enumtest;

public class TestEnum {

	public static void main(String[] args) {
		City[] city = City.values();
		for (City C : city) {
			System.out.println("城市：" + C + " 中文名：" + C.getName());
		}
		System.out.println();
		University[] university = University.values();
		for (University U : university) {
			System.out.println("大学：" + U + " 中文名：" + U.getName() + " 所在城市:" + U.getCity());
		}
	}
}
