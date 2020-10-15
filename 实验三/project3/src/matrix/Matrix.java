package matrix;

public class Matrix {
	private int rows;
	private int cols;
	private double[][] data;

	Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.data = new double[rows][cols];
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public double getData() {
		return data[rows][cols];
	}

	public void setElement(int row, int col, double value) {
		this.data[row][col] = value;
	}

	public Matrix add(Matrix m) {
		Matrix temp = new Matrix(this.rows, this.cols);
		if (this.rows != m.rows || this.cols != m.cols) {
			return null;
		}
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				temp.data[i][j] = this.data[i][j] + m.data[i][j];
			}
		}
		return temp;
	}

	public Matrix minus(Matrix m) {
		Matrix temp = new Matrix(this.rows, this.cols);
		if (this.rows != m.rows || this.cols != m.cols) {
			return null;
		}
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				temp.data[i][j] = this.data[i][j] - m.data[i][j];
			}
		}
		return temp;
	}

	public Matrix multiple(Matrix m) {
		Matrix temp = new Matrix(this.rows, m.cols);
		if (this.cols != m.rows) {
			return null;
		}
		for (int i = 0; i < temp.rows; i++) {
			for (int j = 0; j < temp.cols; j++) {
				for (int k = 0; k < this.cols; k++) {
					temp.data[i][j] += this.data[i][k] * m.data[k][j];
				}

			}
		}
		return temp;
	}

	public Matrix transposition() {
		Matrix temp = new Matrix(this.cols, this.rows);
		for (int i = 0; i < temp.rows; i++) {
			for (int j = 0; j < temp.cols; j++) {
				temp.data[i][j] = this.data[j][i];
			}
		}
		return temp;
	}

	public void display() {
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++)
				System.out.format("%7.0f", this.data[i][j]);
			System.out.println();
		}
	}
}
