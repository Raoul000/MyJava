package rect;

public class Rect {
	protected double width;
	protected double height;

	public Rect(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public Rect() {
		this.height = 10;
		this.width = 10;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return (height + width) * 2;
	}
}
