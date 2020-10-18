package rect;

public class TestPlainRect {

	public static void main(String[] args) {
		PlainRect plainRect1 = new PlainRect(10, 10, 3, 4);
		PlainRect plainRect2 = new PlainRect(5, 5, 1, 1);
		System.out.println(plainRect1);
		System.out.println(plainRect2);
		System.out.println("(13,20)在矩形plainRect1内吗？");
		System.out.println(plainRect1.isInside(13, 20));
		System.out.println("(1,2)在矩形plainRect2内吗？");
		System.out.println(plainRect2.isInside(1, 2));
		System.out.println("矩形 plainRect1面积周长和：");
		System.out.println(plainRect1.getArea() + plainRect1.getPerimeter());
		System.out.println("矩形 plainRect2面积周长和：");
		System.out.println(plainRect2.getArea() + plainRect2.getPerimeter());
	}

}
