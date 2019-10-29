import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends AbstractEntity {
	
	private static final int WIDTH = 32, HEIGHT = 32;
	private static Random random = new Random();
	
	private int velX, velY;
	
	public Ball(int x, int y) {
		super(x , y);
		velX = random.nextInt(8) - 4;
		velY = random.nextInt(4) + 2;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), WIDTH, HEIGHT);
	}
	
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.WHITE);
		g2d.fillOval(getX(), getY(), WIDTH, HEIGHT);
	}
	
	public void update() {
		setX(getX() + velX);
		setY(getY() + velY);
	}
	
	public void checkCollisions() {
		if(getX() <= 0) {
			velX = -velX;
			
		if(getY() <= 0)  {
			velY = -velY;
		}
		
		if(getY() + HEIGHT >= 610) {
			velY = -velY;
		}
		
		if(getX() + WIDTH >= 790) {
			velX = -velX;
		}
	}
}
	public void negateY() {
		velY = -velY;
	}
}
