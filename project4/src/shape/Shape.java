package shape;

public abstract class Shape {
	private final static double PI = 3.14;

	public static double getPI() {
		return PI;
	}

	public abstract double getPerimeter();

	public abstract double getArea();
}
