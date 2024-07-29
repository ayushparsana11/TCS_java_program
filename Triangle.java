package Geometry;

public class Triangle {
	private double base;
	private double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public double calculateArea()
	{
		return 0.5*base*height;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", calculateArea()=" + calculateArea() + "]";
	}
	
	
}
