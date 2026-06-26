package animation;

public class Circle implements Shape {
	protected int x,y,ray;
	public Circle(int x, int y, int ray) {
		this.x = x;
		this.y = y;
		this.ray = ray;
	}
	public void move(int dx,int dy) {
		this.x += dx;
		this.y += dy;
	}
	public String toString() {
		return "Circ(" +x+ "," +y+ "," +ray+ ")";
	}
}
