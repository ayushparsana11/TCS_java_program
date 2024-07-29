package tnsif.newpackage.countryInfo;

public class Country {
	private String name;
	
	public Country()
	{
		
	}

	@Override
	public String toString() {
		return "Country [name=" + name + "]";
	}

	public Country(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
