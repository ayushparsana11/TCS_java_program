package Day13;
import java.util.*;

public class MainException {
	public static void main(String[] args){
		//TODO Auto-generated method stub
		ThrowException ob = new ThrowException();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks : ");
		int mark = sc.nextInt();
		ob.setMarks(mark);
		System.out.println("Marks : "+ob.getMarks());
	}
	
}