package enumtest;

public enum University {
	JIMEIUNIVERSITY("������ѧ", City.XIAMEN), XIAMENUNIVERSITY("���Ŵ�ѧ", City.XIAMEN),
	TSINGHUAUNIVERSITY("�廪��ѧ", City.BEIJING), FUDANUNIVERSITY("������ѧ", City.SHANGHAI);

	private String name;// ��������
	private City city;// ���ڳ���

	private University(String name, City c) {
		this.name = name;
		this.city = c;
	}

	public City getCity() {
		return city;
	}

	public String getName() {
		return name;
	}
}
