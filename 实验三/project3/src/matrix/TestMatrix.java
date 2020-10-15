package matrix;

public class TestMatrix {

	public static void main(String[] args) {
		Matrix matrix1 = new Matrix(4, 4);
		for (int i = 0; i < matrix1.getRows(); i++) {
			for (int j = 0; j < matrix1.getCols(); j++) {
				matrix1.setElement(i, j, Math.random() * 10);
			}
		}
		Matrix matrix2 = new Matrix(4, 4);
		for (int i = 0; i < matrix1.getRows(); i++) {
			for (int j = 0; j < matrix1.getCols(); j++) {
				matrix2.setElement(i, j, Math.random() * 10);
			}
		}
		System.out.println("First Matrix:");
		matrix1.display();
		System.out.println("Second Matrix");
		matrix2.display();
		Matrix addMatrix = new Matrix(4, 4);
		addMatrix = matrix1.add(matrix2);
		System.out.println("Add Result:");
		addMatrix.display();
		Matrix minusMatrix = new Matrix(4, 4);
		minusMatrix = matrix2.minus(matrix1);
		System.out.println("Minus Result:");
		minusMatrix.display();
		Matrix transMatrix = new Matrix(4, 4);
		transMatrix = matrix1.transposition();
		System.out.println("Transpostion Result:");
		transMatrix.display();
		Matrix multipeMatrix = new Matrix(4, 4);
		multipeMatrix = matrix1.multiple(matrix2);
		System.out.println("Multiple Result:");
		multipeMatrix.display();
	}

}
