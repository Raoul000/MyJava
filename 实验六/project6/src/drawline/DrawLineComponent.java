package drawline;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class DrawLineComponent extends JComponent {
	private Point2D.Double[] points1, points2, points3;

	public DrawLineComponent(Point2D.Double[] points1, Point2D.Double[] points2, Point2D.Double[] points3) {
		this.points1 = points1;
		this.points2 = points2;
		this.points3 = points3;

	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Dimension size = this.getSize();
		int w = (int) size.getWidth();
		int h = (int) size.getHeight();
		// ªÊ÷∆◊¯±Í÷·
		g2.drawLine(0, h / 2, w, h / 2);// ª≠x÷·
		g2.drawLine(w / 2, 0, w / 2, h);// ª≠y÷·
//		g2.translate(w/2, h/2);
		// ªÊ÷∆∫Ø ˝ÕºœÒ
		for (int i = 1; i < this.points1.length; i++) {
			g2.drawLine((int) points1[i - 1].getX(), (int) points1[i - 1].getY(), (int) points1[i].getX(),
					(int) points1[i].getY());
		}
		g2.setColor(Color.BLUE);
		for (int i = 1; i < this.points2.length; i++) {
			g2.drawLine((int) points2[i - 1].getX(), (int) points2[i - 1].getY(), (int) points2[i].getX(),
					(int) points2[i].getY());
		}
		g2.setColor(Color.GREEN);
		for (int i = 1; i < this.points3.length; i++) {
			g2.drawLine((int) points3[i - 1].getX(), (int) points3[i - 1].getY(), (int) points3[i].getX(),
					(int) points3[i].getY());
		}

	}

}
