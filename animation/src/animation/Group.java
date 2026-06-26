package animation;

import java.util.Stack;

public class Group implements Shape{
	private Stack<Shape> shapes = new Stack<Shape>();
	
	public void push(Shape shape) {
		shapes.push(shape);
	}
	
	public void move(int dx, int dy) {
		for (Shape shape : shapes)
			shape.move(dx, dy);
	}
	public String toString() {
		return "Group("+shapes.toString()+")";
	}
}
