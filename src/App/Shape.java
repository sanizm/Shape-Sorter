package App;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

	protected int localeX;
	protected int localeY;
	protected int width;
	protected int height;
	protected RGBGenerator GenerateRGB;
	protected String typeShape;
	protected Color color;

	public Shape(int localeX, int localeY, int width, int height, String typeShape) {
		this.localeX = localeX;
		this.localeY = localeY;
		this.width = width;
		this.height = height;
		this.typeShape = typeShape;
		this.GenerateRGB = new RGBGenerator();
		this.color = new Color(this.GenerateRGB.getR(), this.GenerateRGB.getG(), this.GenerateRGB.getB());
	}

	public abstract int calcArea();

	public int getLocaleX() {
		return this.localeX;
	}

	public int getLocaleY() {
		return this.localeY;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public Color getColor() {
		return this.color;
	}

	public String getName() {
		return this.typeShape;
	}

	public void setLocale(int x, int y) {
		this.localeX = x;
		this.localeY = y;
	}

	public abstract void draw(Graphics g, Color c);

}
