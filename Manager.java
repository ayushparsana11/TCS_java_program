package Day7_Hierarchi_inhe;

public class Manager extends Member{
	private String spec;
	private String dept;
	
	@Override
	public String toString() {
		return "Name : "+getName() +" | Age : "+getAge() +" | Phn : "+getPhn()+" | Add : "+getAdd()+" | spec=" + spec + " | dept=" + dept;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
