package enumtest;

public enum University {
	JIMEIUNIVERSITY("集美大学", City.XIAMEN), XIAMENUNIVERSITY("厦门大学", City.XIAMEN),
	TSINGHUAUNIVERSITY("清华大学", City.BEIJING), FUDANUNIVERSITY("复旦大学", City.SHANGHAI);

	private String name;// 中文名称
	private City city;// 所在城市

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
