package App;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square extends Shape {

	private Square(int localeX, int localeY, int width, int height, String typeShape) {
		super(localeX, localeY, width, height, typeShape);
	}

	@Override
	public int calcArea() {
		return (this.getWidth() * this.getHeight());
	}

	@Override
	public void draw(Graphics g, Color c) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(c);
		g2D.fillRect(this.getLocaleX(), this.getLocaleY(), this.getWidth(), this.getHeight());
	}

	public static Square getInstance(int localeX, int localeY, int width, int height, String typeShape) {
		return new Square(localeX, localeY, width, height, typeShape);
	}

}
