package project1;

public class ApproximationOfE {
	public static void main(String[] args) {
		double sum = 1;
		double e = 1;
		int i = 1;
		while (1 / sum >= 1e-6) {
			e = e + 1 / sum;
			i++;
			sum = sum * i;
		}
		System.out.println("e=" + e);
	}
}
