package Day9_Final_Abstract;

public class FinalDemo {
	private double radius;
	private final double pi = 3.14;
	 
	public void display()
	 { 
		System.out.println("Area Of Circle Is : "+pi*radius*radius);
	 }
	 
	public double getRadius() 
	{ 
		return radius;
	 }
	 public void setRadius(double radius)
	 {
	  this.radius = radius; 
	  }
}
