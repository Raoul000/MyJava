package enumtest;

public enum City {
	XIAMEN("����"), BEIJING("����"), SHANGHAI("�Ϻ�"), CHENGDU("�ɶ�");

	private String name;// ��������

	private City(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
