import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class Paddle extends AbstractEntity {
	
	protected static final int WIDTH = 100, HEIGHT = 25;
	
	public Paddle (int x, int y) {
		super(x , y);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), WIDTH, HEIGHT);
	}
	
	public void checkCollision(Ball ball) {
		if (ball.getBounds().intersects(getBounds())) {
			ball.negateY();
		}
		if(getX() + WIDTH >= 790)
			setX(790 - WIDTH);
		if(getX() <=0)
			setX(0);
		checkCollision(ball);	
		}

	
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.WHITE);
		g2d.fillRect(getX(), getY(), WIDTH, HEIGHT);
	}
	
}
