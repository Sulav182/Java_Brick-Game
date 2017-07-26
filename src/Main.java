import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame  frame = new JFrame("Block Breaker");
		BlockBreakerPanel panel = new BlockBreakerPanel();
		//System.out.println("Before adding panel");
		frame.getContentPane().add(panel);
		//System.out.println("After adding panel");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//System.out.println("frame default close");
		frame.setVisible(true);
		//System.out.println("After setVisible");
		frame.setSize(490, 600);
		//System.out.println("After set size");
		
		frame.setResizable(false);
		//System.out.println("After resizable");
	}
	

}
