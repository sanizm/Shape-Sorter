package App;

public class ShapeFactory {

	private RandomNumGenerator generateRandomNum;

	public Shape getShape(String typeShape) {
		if (typeShape.equalsIgnoreCase("CIRCLE")) {
			this.generateRandomNum = new RandomNumGenerator(85, 45, 0, 0);
			int diameter = this.generateRandomNum.getRandomWidth();
			return Circle.getInstance(45, 15, diameter, diameter, "Circle");
		} else if (typeShape.equalsIgnoreCase("RECTANGLE")) {
			this.generateRandomNum = new RandomNumGenerator(85, 55, 45, 20);
			return Rectangle.getInstance(135, 95, this.generateRandomNum.getRandomWidth(),
					this.generateRandomNum.getRandomHeight(), "Rectangle");
		} else if (typeShape.equalsIgnoreCase("SQUARE")) {
			this.generateRandomNum = new RandomNumGenerator(85, 45, 0, 0);
			int Sqside = this.generateRandomNum.getRandomWidth();
			return Square.getInstance(230, 185, Sqside, Sqside, "Square");
		} else if (typeShape.equalsIgnoreCase("SEMICIRCLE")) {
			this.generateRandomNum = new RandomNumGenerator(90, 50, 90, 50);
			return SemiCircle.getInstance(320, 265, this.generateRandomNum.getRandomWidth(),
					this.generateRandomNum.getRandomHeight(), "SemiCircle");
		} else if (typeShape.equalsIgnoreCase("OVAL")) {
			this.generateRandomNum = new RandomNumGenerator(50, 30, 85, 50);
			return Oval.getInstance(390, 350, this.generateRandomNum.getRandomWidth(),
					this.generateRandomNum.getRandomHeight(), "Oval");
		} else if (typeShape.equalsIgnoreCase("YRECTANGLE")) {
			this.generateRandomNum = new RandomNumGenerator(45, 20, 85, 55);
			return YRectangle.getInstance(480, 425, this.generateRandomNum.getRandomWidth(),
					this.generateRandomNum.getRandomHeight(), "Rectangle");
		}
		return null;
	}
}
