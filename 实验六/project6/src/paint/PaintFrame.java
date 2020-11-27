package paint;

import javax.swing.JFrame;

public class PaintFrame extends JFrame {
	public PaintFrame() {
		this.setVisible(true);
		this.setSize(600, 600);
		this.setTitle("Painting");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出时关闭
		this.setLocationRelativeTo(null);//居中
		this.add(new PaintComponent());
	}
}
