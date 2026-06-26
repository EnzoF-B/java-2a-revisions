package animation;

import java.util.Stack;

public class Animation {
	public static void main(String[] args) {
		String code = "100 150 200 50 RECT 100 150 50 CIRC 2 GROUP 5 0 MOVE";
		String[] words = code.split(" ");
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Shape> shapes = new Stack<Shape>();
		for (String w : words) 
			if(w.equals("RECT")) {
				int dy = stack.pop();
				int dx = stack.pop();
				int y = stack.pop();
				int x = stack.pop();
				shapes.push(new Rectangle(x,y,dx,dy));
			} else if (w.equals("CIRC")) {
				int ray = stack.pop();
				int y = stack.pop();
				int x = stack.pop();
				shapes.push(new Circle(x,y,ray));
			} else if (w.equals("GROUP")) {
				Group g = new Group();
				int count = stack.pop();
				for (int i=0; i<count;i++)
					g.push(shapes.pop());
				shapes.push(g);
			} else if (w.equals("MOVE")) {
				int dy = stack.pop();
				int dx = stack.pop();
				Shape shape = shapes.pop();
				shape.move(dx,dy);
				shapes.push(shape);
			}
			else 
				stack.push(Integer.parseInt(w)); 
		
		System.out.println(stack);
		System.out.println(shapes);
		
	}
}
