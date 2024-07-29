package Day18_Queue;

import java.util.*; 

public class QueueState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qs = new LinkedList<String>();
		
		qs.add("Gujarat");
		qs.add("Maharashtra");
		qs.add("Rajashthan");
		qs.add("Madhya Pradesh");
		qs.add("Punjab");
		qs.add("Delhi");
		
		for (String state : qs) {
            System.out.println(state);
        }
		
	}

}
