package Day5;
import tnsif.newpackage.countryInfo.*;
import tnsif.newpackage.personalInfo.*;

public class CalculateTaxCountry {
	public void taxCal(Person p)
	{
		double tax=0.0;
		
		if(p.getAge() >= 18)
		{
			if(p.getSal() >= 50000 && p.getSal() < 70000)
			{
				tax = p.getSal()*0.05;
			}
			else if(p.getSal() >= 70000 && p.getSal() < 100000)
			{
				tax = p.getSal()*0.10;
			}
			else if(p.getAge() >= 100000)
			{
				tax=p.getSal()*0.15;
			}
			else
			{
				System.out.println("No tax applicable ");
			}
		}
		else
		{
			System.out.println("Below the age so no tax applicable");
		}
		
		System.out.println("Payable Tax : "+tax);
	}
}
