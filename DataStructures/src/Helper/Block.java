package Helper;

import java.awt.Color;
import java.awt.Graphics;

public class Block {
	
	public static int blockSize = 20;
	private int x, y, red, green, blue;
	
	public Block(int x, int y, int red, int green, int blue) {
		this.x = x;
		this.y = y;
		this.red = red;
		this.blue = blue;
		this.green = green;
		
	}
	
	public void draw(Graphics g) {
		
		g.setColor(new Color(red,green,blue));
		g.fillRect(x * blockSize, y * blockSize, blockSize, blockSize);
	}
	
	public void setColor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
}
