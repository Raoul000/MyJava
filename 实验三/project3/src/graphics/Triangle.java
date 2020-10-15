package graphics;

public class Triangle {
	private double length1;
	private double length2;
	private double length3;

	public Triangle() {
		this.length1 = 8;
		this.length2 = 6;
		this.length3 = 5;
	}

	public double getPerimeter() {
		return (length1 + length2 + length3);
	}

	public double getArea() {
		return 0.25 * Math.sqrt((length1 + length2 + length3) * (length1 + length2 - length3)
				* (length1 + length3 - length2) * (length2 + length3 - length1));
	}
}
