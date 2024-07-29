package color;

public class Employee {

	private String ename;
	private int sal;
	
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getSal() {
		return sal;
	}
	
	public void setSal(int sal) 
	{
		try
		{
			if(sal < 5000)
			{
				throw new SalaryException("Salary Must be Grater Than 5000");
			}
			else
			{
				this.sal = sal;
			}
		}
		catch(SalaryException se)
		{
			System.out.println(se.getMessage());
		}
	}
}