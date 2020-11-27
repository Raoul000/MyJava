package two;

import java.awt.geom.Point2D;

import javax.swing.JFrame;

public class DrawLineFrame extends JFrame {
	public DrawLineFrame() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �رմ���ʱ��������
		this.setSize(600, 600);
		this.setTitle("DrawLineFrame");
		this.setLocationRelativeTo(null); // ����
		// �����Զ������(��װ)
		this.add(new DrawLineComponent(setPoint1(), setPoint2(), setPoint3()));
	}

	// �����ȡ(Point2D)���ϵķ���
	public Point2D.Double[] setPoint1() { // �Զ��庯��
		Point2D.Double[] point = new Point2D.Double[600];
		int k = 1;
		for (int i = 0; i < point.length; i++) {
			double y = 600 - i * k;
			point[i] = new Point2D.Double(i, y);
		}
		return point;
	}

	public Point2D.Double[] setPoint2() {// ���Һ����ĵ㼯
		Point2D.Double[] point = new Point2D.Double[360];
		for (int i = 0; i < point.length; i++) {
			double x = Math.toRadians(-360 + 5 * i); // ��-360�㿪ʼ��ÿ������5��
			point[i] = new Point2D.Double(x * 100 + getSize().width / 2, Math.sin(x) * 150 + getSize().height / 2);
		}
		return point;
	}

	public Point2D.Double[] setPoint3() {// ���Һ����ĵ㼯
		Point2D.Double[] point = new Point2D.Double[360];
		for (int i = 0; i < point.length; i++) {
			double x = Math.toRadians(-360 + 5 * i); // ��-360�㿪ʼ��ÿ������5��
			point[i] = new Point2D.Double(x * 100 + getSize().width / 2, Math.cos(x) * 150 + getSize().height / 2);
		}
		return point;
	}
}
