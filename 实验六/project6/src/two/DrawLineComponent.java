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
		// ����������
		g2.drawLine(0, h / 2, w, h / 2);// ��x��
		g2.drawLine(w / 2, 0, w / 2, h);// ��y��
//		g2.translate(w/2, h/2);
		// ���ƺ���ͼ��
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

	private int selection = 0; // 0:δѡ,1:�ı�λ��,2:�ı��С
	private int lastX, lastY; // �϶�ʱǰһʱ�̵�λ��

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if (selection == 0)
			return; // ûѡ��
		int px = e.getX(), py = e.getY();
		// ����(Model)
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
		// �ػ�(View)
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int px = e.getX(), py = e.getY();
		if (isInArea(px, py)) {
			this.setCursor(new Cursor(Cursor.HAND_CURSOR));   //���ɽ����ƶ������ʾΪ����
		} else if (isSelected(px, py)) {
			this.setCursor(new Cursor(Cursor.N_RESIZE_CURSOR));  //�����Խ������Ź����ʾΪָ��
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
		if (isInArea(px, py) && e.getButton() == MouseEvent.BUTTON1) { // �����������ƶ�
//					JOptionPane.showMessageDialog(this, "������ѡ��");
			selection = 1;
			lastX = px;
			lastY = py;

		} else if (e.getButton() == MouseEvent.BUTTON3 && isSelected(px, py)) { // ����Ҽ���������
//					JOptionPane.showMessageDialog(this, "����Ҽ�ѡ��");
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
		// ��굯��
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

	// ���߽߱Ǵ���
	public boolean isInArea(int x, int y) {
		for (Point2D.Double p : this.points2) {
			if (x > p.x && x <= p.x + 6 && y > p.y && y <= p.y + 6)
				return true;
		}
		return false;
	}

	// �ж��Ƿ�ѡ���������ϵĵ�
	public boolean isSelected(int x, int y) {
		for (Point2D.Double p : points2) {
			if (x > p.x - 6 && x <= p.x && y >= p.y - 6 && y <= p.y)
				return true;
		}
		return false;
	}
}
