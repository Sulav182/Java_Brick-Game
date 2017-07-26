import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Block extends Rectangle{
	Image pic;
	int dx=3;
	int dy=-3;
	Rectangle left, right;
	boolean destroyed =false;
	boolean powerup = false;
	Block(int a, int b, int w, int h, String s){
		x=a;
		y=b;
		width=w;
		height=h;
		left = new Rectangle(a-1,b,1,h);
		right = new Rectangle(a+w+1,b,1,h);
		pic = Toolkit.getDefaultToolkit().getImage(s);
		//System.out.println("Inside block");
	}
	public void draw(Graphics g, Component c){
		if(!destroyed)
		//System.out.println("In side draw");
			g.drawImage(pic,x,y,width,height,c );
	}
	
}
