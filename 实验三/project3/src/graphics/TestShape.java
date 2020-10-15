package graphics;

public class TestShape {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle();
		double area = rectangle1.getArea() + rectangle2.getArea() + triangle1.getArea() + triangle2.getArea()
				+ circle1.getArea() + circle2.getArea();
		double perimeter = rectangle1.getPerimeter() + rectangle2.getPerimeter() + triangle1.getPerimeter()
				+ triangle2.getPerimeter() + circle1.getPerimeter() + circle2.getPerimeter();
		System.out.println("面积=" + area);
		System.out.println("周长=" + perimeter);
	}

}
