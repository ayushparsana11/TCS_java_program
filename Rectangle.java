package Day6_inheritance;

public class Rectangle {
	private double length;
	private double breath;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	public Rectangle(double length, double breath) {
		//super();
		this.length = length;
		this.breath = breath;
	}
	Rectangle(){
		
	}
	
	public double areaCal(){
		return length*breath;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + ", areaCal()=" + areaCal() + "]";
	}
	
	
	
	
}
