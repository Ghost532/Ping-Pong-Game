
public class Main {
	
	private final Game game;
	
	public Main() {
		game = new Game(600, 600, "Ping Pong");
		game.getsScreenFactory().showScreen(new MainScreen(game.getsScreenFactory()));
	}

	public static void main(String[] args) {
		new Main();
	}
	
}
