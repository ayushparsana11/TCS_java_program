package Day3;
import java.util.*;
public class EmpMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No : ");
		no=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Name : ");
		name=sc.nextLine();

		Employee e1 = new Employee();
		Employee e2 = new Employee(name,no);
		
		/*e1.setNo(101);
		e1.setName("Sakshi");
		
		e2.setNo(102);
		e2.setName("Hemangi");*/
		
		System.out.println("Employee 1 : "+e1);
		System.out.println("Employee 2 : "+e2);

}
}