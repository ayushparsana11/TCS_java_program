//2.Write a program to print the area of a rectangle by 
//creating a class named 'Area' having two methods. First 
//method named as 'setDim' takes length and breadth of 
//rectangle as parameters and the second method named as 
//'getArea' returns the area of the rectangle.

package Day2;

public class Area {
	private float length;
	private float breath;
	
	public void SetDimention(float length, float breath )
	{
		this.length=length;
		this.breath=breath;
	}
	public float getArea()
	{
		return length*breath;
	}
	}

