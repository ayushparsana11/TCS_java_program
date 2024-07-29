package first;
import java.util.*;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No 1 : ");
		int no1=sc.nextInt();
		System.out.print("Enter No 2 : ");
		int no2=sc.nextInt();
		
		System.out.println("Addition : "+(no1+no2));
		System.out.println("Substraction : "+(no1-no2));
		System.out.println("Multiplication : "+(no1*no2));
		System.out.println("Division : "+(float)(no1/no2));
		
		AccessMod ob = new AccessMod();
		ob.setRollno(13);
		ob.setName("Yuvraj");
		System.out.println("Roll no : "+ob.getRollno());
		System.out.println("Name : "+ob.getName());
	}

}
