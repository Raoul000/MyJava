package paint;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JComponent;

public class PaintComponent extends JComponent implements MouseListener, MouseMotionListener {
	private int selection = 0; // 0:未选中,1:选中
	ArrayList<Point2D> point = new ArrayList<Point2D>();
	ArrayList<Line2D> line = new ArrayList<Line2D>();
	ArrayList<ArrayList<Line2D>> lines = new ArrayList<ArrayList<Line2D>>();

	public PaintComponent() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;
		lines.add(line);
		for (int i = 0; i < lines.size() - 1; i++) {
			for (Line2D l : lines.get(i)) {
				g1.draw(l);
			}
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (selection == 1) { // 选中
			point.add(new Point2D.Double(e.getX(), e.getY()));
		}
		for (int i = 0; i < point.size() - 1; i++) {
			line.add(new Line2D.Double(point.get(i), point.get(i + 1)));
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) { // 鼠标按下表示选中
		// TODO Auto-generated method stub
		selection = 1;
	}

	@Override
	public void mouseReleased(MouseEvent e) { // 当鼠标松开时将前面一些列点存入文件
		try {
			preservation();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		point.clear();
		selection = 0; // 重置

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void preservation() throws IOException { // 将点存入文件
		FileWriter f = new FileWriter("point.txt", true);
		PrintWriter out = new PrintWriter(f);
		for (int i = 0; i < point.size() - 1; i++) {
			out.print("(" + point.get(i).getX() + "," + point.get(i).getY() + ")");
		}
		out.print("\t\n");
		out.close();
	}

}
