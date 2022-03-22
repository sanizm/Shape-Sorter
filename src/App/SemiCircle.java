package App;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class SemiCircle extends Shape {

	private SemiCircle(int localeX, int localeY, int width, int height, String typeShape) {
		super(localeX, localeY, width, height, typeShape);
	}

	@Override
	public int calcArea() {
		return (int) ((this.width / 2) * (this.height / 2) * Math.PI) / 2;
	}

	@Override
	public void draw(Graphics g, Color c) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(c);
		g2D.fillArc(localeX, localeY, getWidth(), getHeight(), 0, 180);
	}

	public static SemiCircle getInstance(int localeX, int localeY, int width, int height, String typeShape) {
		return new SemiCircle(localeX, localeY, width, height, typeShape);
	}

}
