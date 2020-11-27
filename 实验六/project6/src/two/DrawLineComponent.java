package two;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class DrawLineComponent extends JComponent implements MouseMotionListener, MouseListener {
	private Point2D.Double[] points1, points2, points3;

	public DrawLineComponent(Point2D.Double[] points1, Point2D.Double[] points2, Point2D.Double[] points3) {
		this.points1 = points1;
		this.points2 = points2;
		this.points3 = points3;
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Dimension size = this.getSize();
		int w = (int) size.getWidth();
		int h = (int) size.getHeight();
		// 绘制坐标轴
		g2.drawLine(0, h / 2, w, h / 2);// 画x轴
		g2.drawLine(w / 2, 0, w / 2, h);// 画y轴
//		g2.translate(w/2, h/2);
		// 绘制函数图像
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

	private int selection = 0; // 0:未选,1:改变位置,2:改变大小
	private int lastX, lastY; // 拖动时前一时刻的位置

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if (selection == 0)
			return; // 没选中
		int px = e.getX(), py = e.getY();
		// 处理(Model)
		if (selection == 1) {
			for (int i = 0; i < points2.length; i++) {
				points2[i].x += (px - lastX);
				points2[i].y += (py - lastY);
			}
		} else if (selection == 2) {
			for (int i = 0; i < points2.length; i++) {
				if (px >= points2[i].x - 5 && px <= points2[i].x && py >= points2[i].y - 5 && py <= points2[i].y) {
					points2[i].x += (px - lastX);
					points2[i].y += (py - lastY);
				}
			}
		}
		lastX = px;
		lastY = py;
		// 重绘(View)
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int px = e.getX(), py = e.getY();
		if (isInArea(px, py)) {
			this.setCursor(new Cursor(Cursor.HAND_CURSOR));   //当可进行移动光标显示为手型
		} else if (isSelected(px, py)) {
			this.setCursor(new Cursor(Cursor.N_RESIZE_CURSOR));  //当可以进行缩放光标显示为指针
		} else {
			this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int px = e.getX(), py = e.getY();
		if (isInArea(px, py) && e.getButton() == MouseEvent.BUTTON1) { // 鼠标左键进行移动
//					JOptionPane.showMessageDialog(this, "鼠标左键选中");
			selection = 1;
			lastX = px;
			lastY = py;

		} else if (e.getButton() == MouseEvent.BUTTON3 && isSelected(px, py)) { // 鼠标右键进行缩放
//					JOptionPane.showMessageDialog(this, "鼠标右键选中");
			selection = 2;
			lastX = px;
			lastY = py;

		} else {
			selection = 0;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		// 鼠标弹开
		selection = 0;

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// 曲线边角处理
	public boolean isInArea(int x, int y) {
		for (Point2D.Double p : this.points2) {
			if (x > p.x && x <= p.x + 6 && y > p.y && y <= p.y + 6)
				return true;
		}
		return false;
	}

	// 判断是否选择了曲线上的点
	public boolean isSelected(int x, int y) {
		for (Point2D.Double p : points2) {
			if (x > p.x - 6 && x <= p.x && y >= p.y - 6 && y <= p.y)
				return true;
		}
		return false;
	}
}
