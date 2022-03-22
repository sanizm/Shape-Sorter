package App;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {

	private Circle(int localeX, int localeY, int width, int height, String typeShape) {
		super(localeX, localeY, width, height, typeShape);
	}

	@Override
	public int calcArea() {
		return (int) ((this.width / 2) * (this.height / 2) * Math.PI);
	}

	@Override
	public void draw(Graphics g, Color c) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(c);
		g2D.fillOval(this.getLocaleX(), this.getLocaleY(), this.getWidth(), this.getHeight());
	}

	public static Circle getInstance(int localeX, int localeY, int width, int height, String typeShape) {
		return new Circle(localeX, localeY, width, height, typeShape);
	}

}
