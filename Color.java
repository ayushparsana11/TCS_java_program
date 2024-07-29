package Day18_Comparable;

public class Color implements Comparable<Color>{
	private int cno;
	private String Cname;
	
	
	public Color(int cno, String cname) {
		super();
		this.cno = cno;
		Cname = cname;
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	@Override
	public String toString() {
		return "Color [cno=" + cno + ", Cname=" + Cname + "]";
	}
	
	public int compareTo(Color cr){
		return this.Cname.compareTo(cr.Cname);
	}
	
	/*public int compareTo(Color cr){
		return cr.Cname(this.Cname.compareTo);
	}*/ // for print in descending order
	
}
