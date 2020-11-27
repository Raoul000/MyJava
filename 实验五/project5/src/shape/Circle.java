package shape;

public class Circle extends Shape {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double getPerimeter() {
		return r * 2 * PI;
	}

	@Override
	public double getArea() {
		return r * r * PI;
	}

}
