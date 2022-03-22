package App;

import java.awt.Color;
import java.util.ArrayList;

public class InsertionSort {

	private int[] localeX;
	private int[] localeY;
	private ArrayList<Shape> shape;
	private Color[] c;

	private InsertionSort(int[] localeX, int[] localeY, ArrayList<Shape> shape, Color[] c) {
		this.localeX = localeX;
		this.localeY = localeY;
		this.shape = shape;
		this.c = c;
	}

	public void applied() {
		for (int i = 1; i < this.shape.size(); i++) {
			Shape s = this.shape.get(i);
			int j = i - 1;
			while (j >= 0 && this.shape.get(j).calcArea() > s.calcArea()) {
				this.shape.set(j + 1, this.shape.get(j));
				j = j - 1;
			}
			this.shape.set(j + 1, s);
		}

		for (int i = 0; i < this.shape.size(); i++) {
			this.shape.get(i).setLocale(this.localeX[i], this.localeY[i]);
			this.c[i] = this.shape.get(i).getColor();
		}
	}

	public static InsertionSort getInstance(int[] localeX, int[] localeY, ArrayList<Shape> shape, Color[] c) {
		return new InsertionSort(localeX, localeY, shape, c);
	}
}
