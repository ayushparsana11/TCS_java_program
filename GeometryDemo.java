package Geometry;

public class GeometryDemo {
	public static void main(String a[])
	{
		Circle c = new Circle(12);
		Rectangle r = new Rectangle(12.4,17.2);
		Triangle t = new Triangle(2.5,4.12);
		
		System.out.println(c);
		System.out.println(c.calculateArea());
		System.out.println(r);
		System.out.println(r.calculateArea());
		System.out.println(t);
		System.out.println(t.calculateArea());
	}
}
