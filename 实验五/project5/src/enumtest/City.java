package enumtest;

public enum City {
	XIAMEN("厦门"), BEIJING("北京"), SHANGHAI("上海"), CHENGDU("成都");

	private String name;// 中文名称

	private City(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
