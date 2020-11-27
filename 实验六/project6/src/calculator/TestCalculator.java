package calculator;

import java.awt.EventQueue;

public class TestCalculator {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new CalculatorFrame();
			}
		});
	}
}
