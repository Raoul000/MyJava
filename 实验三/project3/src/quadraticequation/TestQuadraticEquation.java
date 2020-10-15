package quadraticequation;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		System.out.println("Please input a,b,c");
		Scanner in = new Scanner(System.in);
		double a, b, c;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		QuadraticEquation quadraticequation = new QuadraticEquation(a, b, c);
		System.out.println("Discriminant=" + quadraticequation.getDiscriminant());
		if (quadraticequation.getDiscriminant() < 0) {
			System.out.println("The equation has no roots.");
		} else if (quadraticequation.getDiscriminant() == 0) {
			System.out.println(quadraticequation.getRoot1());
		} else if (quadraticequation.getDiscriminant() > 0) {
			System.out.println("Root1:" + quadraticequation.getRoot1());
			System.out.println("Root2:" + quadraticequation.getRoot2());
		}
	}

}
