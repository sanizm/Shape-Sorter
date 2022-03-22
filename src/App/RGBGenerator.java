package App;

public class RGBGenerator {
	
	private int R;
	private int G;
	private int B;
	private  final int MAX_VALUE = 250;
	private  final int MIN_VALUE = 0;
	
	RGBGenerator(){
		this.R = (int) (Math.random() * (this.MAX_VALUE - this.MIN_VALUE)) + this.MIN_VALUE;
		this.G = (int) (Math.random() * (this.MAX_VALUE - this.MIN_VALUE)) + this.MIN_VALUE;
		this.B = (int) (Math.random() * (this.MAX_VALUE - this.MIN_VALUE)) + this.MIN_VALUE;
	}
	
	public int getR() {
		return this.R;
	}
	
	public int getG() {
		return this.G;
	}
	
	public int getB() {
		return this.B;
	}

}
