package geom;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Editor extends JFrame {
	private int x1, y1, x2, y2;
	private int state = 0;
	private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	public Editor() {
		this.setTitle("Editor");
		Canvas can =new Canvas() {
			public void paint(Graphics g) {
				for (Rectangle r : rectangles)
					g.drawRect(r.x1,r.y1,r.x2-r.x1,r.y2-r.y1);
			}
		};
		can.setSize(2000, 1000);
		can.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar()=='q') System.exit(0);
			}
			public void keyReleased(KeyEvent e) {
			}});
		can.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
				//System.out.println("click "+e.getX()+" "+e.getY());
				if (state==0) {
					state = 1;
					x1 = e.getX();
					y1 = e.getY();
				} else if (state==1) {
					state = 0;
					x2 = e.getX();
					y2 = e.getY();
					rectangles.add(new Rectangle(x1,y1,x2,y2));
					can.repaint();
				}
			}
			public void mouseReleased(MouseEvent e) {
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}});
		
		JPanel tbx = new JPanel();
		
		tbx.add(new JButton("Rect"));
		tbx.add(new JButton("Circ"));
		
		this.add(tbx);
		this.add(can);
	
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);		
	}

	public static void main(String[] args) {
		Editor frame = new Editor();
	}
}
