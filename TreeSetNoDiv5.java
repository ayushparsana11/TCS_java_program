package Day19_Set;

import java.util.*;

public class TreeSetNoDiv5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> tr = new TreeSet<Integer>();
		int no;
		for(int i=0;i<5;i++){
			System.out.println("Enter No : ");
			no = sc.nextInt();
		
		
			if(no%5==0){
				tr.add(no);
			}
		}
		
		tr.forEach(i -> System.out.println("No Div by 5 is : "+ i));
	}
}