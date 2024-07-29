package color;

public class color {

	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) 
	{
		try
		{
			if(!cname.equals("Red") && !cname.equals("Green") && !cname.equals("White"))
			{
				throw new ColorException("Opps..! Color Not Found...");	
			}
			else	
			{
				this.cname = cname;
			}
		}
		catch(ColorException ce)
		{
			System.out.println(ce.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Color Is " + cname;
	}
	
	
}
