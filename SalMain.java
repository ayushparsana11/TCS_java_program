package Day7_Hierarchi_inhe;

public class SalMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setName("yuvraj");
		e.setAge(22);
		e.setAdd("Ahm");
		e.setPhn("5464432234");
		e.setSal(55000);
		e.setSpec("react js");
		e.setDept("Devlopment");
		
		Manager m = new Manager();
		m.setName("om");
		m.setAge(23);
		m.setAdd("jamnagar");
		m.setPhn("34534533345");
		m.setSal(45000);
		m.setSpec("Android");
		m.setDept("Design");
		
		System.out.println("Employee : ");
		e.printSalary();
		System.out.println(e);
		
		System.out.println("Manager : ");
		m.printSalary();
		System.out.println(m);
		
	}
}
