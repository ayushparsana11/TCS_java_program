package Geometry;

public class Circle {
	private double r;
	private double pi=3.14;
	
	public double getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public Circle(float r) {
		super();
		this.r = r;
	}
	
	public double calculateArea() {
        return (double)pi*r*r;
    }
	@Override
	public String toString() {
		return "Circle [r=" + r + ", pi=" + pi + ", calculateArea()=" + calculateArea() + "]";
	}

	
}
