package animation;

public class Rectangle implements Shape {
	protected int x,y,dx,dy;
	public Rectangle(int x, int y, int dx, int dy) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
	}
	public String toString() {
		return "Rect(" +x+ "," +y+ "," +dx+ "," +dy+ ")";
	}
	public void move(int dx,int dy) {
		this.x += dx;
		this.y += dy;
	}
}
