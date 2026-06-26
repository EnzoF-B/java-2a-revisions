package geom;

public class Line {
	protected Point from;
	protected Point to;
	public Line(Point from,Point to) {
		this.from = from;
		this.to = to;
	}
	public PointSet getPointSet() {
		PointSet pts=new PointSet();
		float a = (to.getY() - from.getY()) / (to.getX() - from.getX());
		int b = from.getY();
		for (int i = from.getX();i<=to.getX();i++) {
			int x = Math.round(a * (i - from.getX())+ b);
			pts.add(new Point(i,x));
			System.out.println(String.format("(%d, %d)",i,x));
		}
		return pts;
	}
	public static void main(String args[]) {
		Image i = new Image(5,5);
		Point f = new Point(0,0);
		Point t = new Point(4,4);
		Line s = new Line(f,t);
		
		System.out.println(i);
	}
}
