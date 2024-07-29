package Day6_inheritance;

public class ParentClass {
	private int amt;

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "ParentClass [amt=" + amt + "]";
	}
	
	
}
