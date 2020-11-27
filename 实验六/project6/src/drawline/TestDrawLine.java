package drawline;

import java.awt.EventQueue;

public class TestDrawLine {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// MyJFrame frame = new MyJFrame();
				new DrawLineFrame();
			}
		});
	}

}
