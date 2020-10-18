package shape;

import java.util.ArrayList;

public class TestShape {

	public static void main(String[] args) {
		ArrayList<Shape> shape = new ArrayList();
		Shape res1 = new Rectangle(8, 7);
		Shape res2 = new Triangle(6, 8, 10);
		Shape res3 = new Circle(5);
		shape.add(res1);
		shape.add(res2);
		shape.add(res3);
		System.out.println("长方形面积：" + res1.getArea() + " 长方形周长：" + res1.getPerimeter());
		System.out.println("三角形面积：" + res2.getArea() + " 三角形周长：" + res2.getPerimeter());
		System.out.println("圆面积：" + res3.getArea() + " 圆周长：" + res3.getPerimeter());
		double result = 0;
		for (Shape res : shape) {
			result += res.getArea() + res.getPerimeter();
		}
		System.out.println("总和：" + result);
	}

}