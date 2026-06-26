package geom;

public abstract class Box {
	protected Point from;
	protected Point to;
	public Box(Point from, Point to) {
		this.from = from;
		this.to = to;
	}
	public void move(int dx,int dy) {
		from.move(dx,dy);
		to.move(dx, dy);
	}
}
