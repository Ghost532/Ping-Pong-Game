import java.awt.Color;
import java.awt.Graphics2D;

public class GameScreen extends Screen {
	
	private Ball ball;
	private Player player;
	
	public GameScreen(ScreenFactory screenFactory) {
		super(screenFactory);
	}
	
	public void onCreate() {
		ball = new Ball(600 - 16, 300 - 16);
		player = new Player(400 - 32, 530);
	}
	
	public void onDraw(Graphics2D g2d) {
		g2d.setColor(Color.blue);
		g2d.fillRect(0, 0, 800, 600);
		ball.draw(g2d);
		player.draw(g2d);		
	}
	
	public void onUpdate() {
		ball.update();
		player.update(ball, this);
	}
	
}
