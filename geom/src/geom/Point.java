package geom;

public class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	};
	public Point clone() {
		return new Point(x,y);
	};
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean equals(Point other) {
		return (x==other.getX()) && (y==other.getY());
	};
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	public static void main(String args[]) {
		Point p1 = new Point(4,1);
		System.out.println(p1.toString());
		Point p2  = p1.clone();
		System.out.println(p1.equals(p2));
}}

