package composition2;

import java.util.Arrays;

public class MyPoint {

	private int x;
	private int y;
	private int[] array = new int[2];

	public MyPoint() {
		setXY(0, 0);
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
		setXY(x, y);
	}

	public double distance() {
		int x1 = 0;
		int y1 = 0;
		int x2 = getX();
		int y2 = getY();

		double sum = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double root = Math.sqrt(sum);
		return root;
	}

	public double distance(int a, int b) {
		int x1 = a;
		int y1 = b;
		int x2 = getX();
		int y2 = getY();

		double sum = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double root = Math.sqrt(sum);
		return root;
	}

	public double distance(MyPoint p1) {
		int x1 = p1.getX();
		int y1 = p1.getY();
		int x2 = getX();
		int y2 = getY();

		double sum = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double root = Math.sqrt(sum);
		return root;
	}

	public int[] getXY() {
		return array;
	}

	public void setXY(int x, int y) {
		setX(x);
		setY(y);
		array[0] = x;
		array[1] = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		array[0] = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		array[1] = y;
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + ", array="
				+ Arrays.toString(array) + "]";
	}

}
