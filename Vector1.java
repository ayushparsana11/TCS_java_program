package Day18_Vector;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> vr = new Vector<String>();
		
		vr.add("Red");
		vr.add("White");
		vr.add("Black");
		vr.add("Blue");
		
		System.out.println(vr);
		
		System.out.println();
		System.out.println("Using iterator");
		
		Iterator ir = vr.iterator();
		
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		System.out.println();
		System.out.println("Using lambda");
		vr.forEach(element -> System.out.println(element)); // lambda function
		System.out.println();
		
		vr.remove(0);
		System.out.println();
		vr.forEach(element -> System.out.println(element)); // lambda function
	}

}
