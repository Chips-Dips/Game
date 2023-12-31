import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class GameWindow {
	private static final int WIDTH=640;
	private static final int HEIGHT=480;
	private JFrame window;
	private Dimension dim;
	private Game game;
	
	public GameWindow(String name) {
		dim = new Dimension(WIDTH,HEIGHT);
		window = new JFrame(name);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setPreferredSize(dim);
		window.setMaximumSize(dim);
		window.setMinimumSize(dim);
		window.setResizable(false);
		window.setBackground(Color.BLACK);
		
		game = new Game(dim);
		window.add(game);
		window.setVisible(true);
	}
	

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		GameWindow gameWindow = new GameWindow("Simple Game");

	}

}
