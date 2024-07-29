package Day6_inheritance;

public class Square extends Rectangle {
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
		//setLength(side);
		//setBreath(side);
	}

	public Square(double length, double breath, double side) {
		super(length, breath);
		this.side = side;
	}
	
	public double sqAreaCal(){
		return side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", sqAreaCal()=" + sqAreaCal() + ", getLength()=" + getLength()
				+ ", getBreath()=" + getBreath() + ", areaCal()=" + areaCal() + "]";
	}

	
	
	
	
	
	
}
