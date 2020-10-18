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
		System.out.println("�����������" + res1.getArea() + " �������ܳ���" + res1.getPerimeter());
		System.out.println("�����������" + res2.getArea() + " �������ܳ���" + res2.getPerimeter());
		System.out.println("Բ�����" + res3.getArea() + " Բ�ܳ���" + res3.getPerimeter());
		double result = 0;
		for (Shape res : shape) {
			result += res.getArea() + res.getPerimeter();
		}
		System.out.println("�ܺͣ�" + result);
	}

}