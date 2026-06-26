package geom;
import java.util.ArrayList;

public class PointSet {
	private ArrayList<Point> pts;
	public void add(Point p) {
		pts.add(p);
	}
	public boolean has(Point p) {
		for (Point x:pts) {
			if (x.equals(p)) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		return pts.toString();
	}
	public PointSet intersection(PointSet other) {
		PointSet result = new PointSet();
		for (Point x:pts) {
			if (other.has(x)) {
				result.add(x);
			}
		}
		return result;
	}
	public PointSet difference(PointSet other) {
		PointSet result = new PointSet();
		for (Point x:pts) {
			if (!other.has(x)) {
				result.add(x);
			}
		}
		return result;
	}
	public void draw(Image img) {
		
	}
	public void fill(Image img) {
		for (Point point: this.pts) {
			img.set(point);
		}
	}
	
}

