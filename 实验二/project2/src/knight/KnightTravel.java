package knight;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class KnightTravel {
	static int a;
	static int b;
	static int avilable;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Point start = new Point();
		a = 5;
		b = 5;
		avilable = 0;
		start.x = in.nextInt();
		start.y = in.nextInt();
		in.close();
		int[][] graph = new int[a][b];
		findAWay(start, graph, 1);
		System.out.println(avilable);
	}

	public static void findAWay(Point state, int[][] graph, int step) {
		if (graph[state.x][state.y] != 0)
			return;
		graph[state.x][state.y] = step;
		ArrayList<Point> dest = overLook(state);
		if (step == a * b) {
			avilable++;
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++)
					System.out.print(graph[i][j] + " ");
				System.out.println();
			}
			System.out.println();
		}
		while (dest.size() != 0) {
			Point tmp = dest.remove(0);
			findAWay(tmp, graph, step + 1);
		}
		graph[state.x][state.y] = 0;
	}

	public static ArrayList<Point> overLook(Point state) {
		ArrayList<Point> dest = new ArrayList<Point>();
		Point tmp = new Point(state);
		if ((tmp.x = state.x - 2) >= 0 && (tmp.y = state.y - 1) >= 0) {
			dest.add(new Point(tmp));
		}
		if ((tmp.x = state.x - 1) >= 0 && (tmp.y = state.y - 2) >= 0) {
			dest.add(new Point(tmp));
		}
		if ((tmp.x = state.x + 1) < a && (tmp.y = state.y - 2) >= 0) {
			dest.add(new Point(tmp));
		}
		if ((tmp.x = state.x + 2) < a && (tmp.y = state.y - 1) >= 0) {
			dest.add(new Point(tmp));
		}
		if ((tmp.x = state.x + 2) < a && (tmp.y = state.y + 1) < b) {
			dest.add(new Point(tmp));
		}
		if ((tmp.x = state.x + 1) < a && (tmp.y = state.y + 2) < b) {
			dest.add(new Point(tmp));
		}
		if ((tmp.x = state.x - 1) >= 0 && (tmp.y = state.y + 2) < b) {
			dest.add(new Point(tmp));
		}
		if ((tmp.x = state.x - 2) >= 0 && (tmp.y = state.y + 1) < b) {
			dest.add(new Point(tmp));
		}
		return dest;
	}
}