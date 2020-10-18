package shape;

public class Circle extends Shape {
	private double R;

	public Circle(double r) {
		super();
		R = r;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(R);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(R) != Double.doubleToLongBits(other.R))
			return false;
		return true;
	}

	@Override
	public double getPerimeter() {
		return R * 2 * getPI();
	}

	@Override
	public double getArea() {
		return R * R * getPI();
	}

	@Override
	public String toString() {
		return "Circle [R=" + R + "]";
	}

}
