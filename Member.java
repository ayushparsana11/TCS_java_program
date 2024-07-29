package Day7_Hierarchi_inhe;

public class Member {
	private String name,add;
	private int age;
	private String phn;
	private double sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhn() {
		return phn;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", add=" + add + ", age=" + age + ", phn=" + phn + ", sal=" + sal + "]";
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void printSalary()
	{
		System.out.println("Salary Is : "+sal);
	}
}
