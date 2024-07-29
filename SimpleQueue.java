package Day18_Queue;

import java.util.*;

public class SimpleQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> q1 = new LinkedList<Integer>();
		
		q1.add(56);
		q1.add(67);
	
		for(int i=56;i<=65;i++){
				q1.add(i);
		}
		System.out.println(q1);
		
		System.out.println("Header Elements : " + q1.peek());
		
		q1.poll(); // deleting head element
		
		System.out.println(q1);
		
		q1.remove();
		System.out.println(q1);
	}

}
