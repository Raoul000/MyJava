package shape;

import java.util.Arrays;

public class TestShape {

	public static void main(String[] args) {
		Shape[] shape = new Shape[5];
		shape[0] = new Rectangle(8, 7);
		shape[1] = new Triangle(6, 8, 10);
		shape[2] = new Circle(5);
		shape[3] = new Circle(6);
		shape[4] = new Triangle(5, 8, 9);
		Arrays.sort(shape);
		for (int i = 0; i < 5; i++) {
			System.out.printf("shape[%d]=%.2f\n", i, shape[i].getArea());
		}
	}

}
