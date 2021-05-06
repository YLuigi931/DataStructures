package Helper;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Frame extends JFrame{
	
	public Frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Flickering Colors");
		setSize(500,500);
		setResizable(true);
		setLocationRelativeTo(null);
		
		init();
		
	}
	
	public void init() {
		setLayout(new GridLayout(1,1,0,0));
		
		Draw d = new Draw();
		add(d);
		
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Frame f = new Frame();

	}

}
