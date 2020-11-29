package Helper;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Draw extends JPanel implements ActionListener {
	
	Timer t = new Timer(100,this);
	
	Block[][] blocks = new Block[20][20];
	
	Random r = new Random();
	
	
	
	public Draw() {
		t.start();
		
		for(int i = 0; i < blocks.length; i++) {
			for(int j = 0; j < blocks[0].length ; j++) {
				blocks[i][j] = new Block(i , j, r.nextInt(255), r.nextInt(255), r.nextInt(255));
			}
		}
	}
	
	private void updateColors() {
		for(int i = 0; i < blocks.length; i++) {
			for(int j = 0; j < blocks[0].length ; j++) {
				blocks[i][j].setColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
			}
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		updateColors();
		
		repaint();
	}
	


	public void paint(Graphics g) {
		for(int i = 0; i < blocks.length; i++) {
			for(int j = 0; j < blocks[0].length ; j++) {
				blocks[i][j].draw(g);
			}
		}
	}
	
}
