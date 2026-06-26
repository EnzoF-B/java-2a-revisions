package geom;

public abstract class Shape {
	public abstract PointSet getPointSet();
	public void draw(Image i) {
		this.getPointSet().draw(i);
	}
	public abstract void move(int dx,int dy);
}
