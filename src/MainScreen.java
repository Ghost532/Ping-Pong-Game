import java.awt.Color;
import java.awt.Graphics2D;

public class MainScreen extends Screen {
	
	private long clicked;

	public MainScreen(ScreenFactory screenFactory) {
		super(screenFactory);
	}
	
	@Override
	public void onCreate() {
		clicked = System.currentTimeMillis();
	}
	
	@Override
	public void onDraw(Graphics2D g2d) {
		g2d.setColor(Color.BLUE);
		g2d.fillRect(0, 0, 800, 600);
		g2d.setColor(Color.WHITE);
		g2d.drawString("Pressione um botão para iniciar", 350, 250);
	}
	
	@Override
	public void onUpdate() {
		if (getsScreenFactory().getGame().getMousepadListener().isMousePressed() && System.currentTimeMillis() - clicked >= 500)  {
			getsScreenFactory().showScreen(new GameScreen(getsScreenFactory()));
		}
	}


}
