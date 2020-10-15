package graphics;

public class Rectangle {
	private int length;
	private int high;

	public Rectangle() {
		this.length = 10;
		this.high = 5;
	}

	public double getPerimeter() {
		return (this.length + this.high) * 2;
	}

	public double getArea() {
		return length * high;
	}

}
