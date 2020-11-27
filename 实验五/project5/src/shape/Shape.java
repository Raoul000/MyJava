package shape;

public abstract class Shape implements Comparable<Shape> {
	public final static double PI = 3.14;

	public abstract double getPerimeter();

	public abstract double getArea();

	@Override
	public int compareTo(Shape o) {
		// 利用面积排序
		return (int) (this.getArea() - o.getArea());
	}

}
