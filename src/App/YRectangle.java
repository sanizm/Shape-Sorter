package App;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class YRectangle extends Shape {
	private YRectangle(int localeX, int localeY, int width, int height, String typeShape) {
		super(localeX, localeY, width, height, typeShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcArea() {
		return (this.width * this.height);
	}

	@Override
	public void draw(Graphics g, Color c) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(c);
		g2D.fillRect(this.getLocaleX(), this.getLocaleY(), this.getWidth(), this.getHeight());
	}

	public static YRectangle getInstance(int localeX, int localeY, int width, int height, String typeShape) {
		return new YRectangle(localeX, localeY, width, height, typeShape);
	}
}
