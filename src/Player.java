import java.awt.event.KeyEvent;

public class Player extends Paddle {

	public Player(int x, int y) {
		super(x, y);

	}

	public void update(Ball ball, Screen screen) {
		if (screen.getsScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_A)) { //esquerda
			setX(getX() - 2);
		}
		
		if (screen.getsScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_D)) { //direita
			setX(getX() + 2);
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
