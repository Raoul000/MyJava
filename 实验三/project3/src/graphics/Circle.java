package graphics;

public class Circle {
	private double R;
	private double PI;

	public Circle() {
		this.R = Math.random() * 10;
		this.PI = 3.14;
	}

	public double getPerimeter() {
		return 2 * PI * R;
	}

	public double getArea() {
		return PI * R * R;
	}
}
