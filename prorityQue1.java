package Day19_PriorityQueue;

import java.util.*;

public class PriorityQue1 {
	public static void main(String[] args){
		Queue <Integer> pq1 = new PriorityQueue<Integer>();
		
		pq1.add(17);
		pq1.offer(12);
		pq1.add(4);
		pq1.add(18);
		
		System.out.println(pq1);
		System.out.println();
		pq1.forEach(q1 -> System.out.println(q1));
		System.out.println();
		pq1.remove(2);
		System.out.println(pq1);
		System.out.println();
		System.out.println(pq1.peek());
	}
}