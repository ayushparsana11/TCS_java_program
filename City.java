package Day6_inheritance;

public class City extends State{
	private String cn;

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	@Override
	public String toString() {
		return "City [cn=" + cn + ", getSname()=" + getSname() + ", getCname()=" + getCname() + "]";
	}

	
	
}
