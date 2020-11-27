package paint;

import java.awt.EventQueue;

public class TestPaint {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new PaintFrame();
			}
		});
	}
}
