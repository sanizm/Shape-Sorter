package App;

public class RandomNumGenerator {
	
	private int MaxX;
	private int MinX;
	private int MaxY;
	private int MinY;
	private int width;
	private int height;
	
	public RandomNumGenerator(int MaxX, int MinX, int MaxY, int MinY) {
		this.MaxX = MaxX;
		this.MinX = MinX;
		this.MaxY = MaxY;
		this.MinY = MinY;
		this.width = (int) (Math.random() * (this.MaxX - this.MinX)) + this.MinX;
		this.height = (int) (Math.random() * (this.MaxY - this.MinY)) +this.MinY;
	}
	
	public int getRandomWidth() {
		return this.width;
	}
	
	public int getRandomHeight() {
		return this.height;
	}

}
