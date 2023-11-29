import java.awt.Graphics;

public abstract class GameObject {
	private int x;
	private int y;
	private int height;
	private int width;

	public abstract void update();
	public abstract void render(Graphics g);
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x=x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
