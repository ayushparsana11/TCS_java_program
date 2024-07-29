package Day23_stream;


import java.util.*;
import java.util.stream.Stream;

public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream <Integer> ob = Stream.of(10,20,30,40,50);
		System.out.println("Count : "+ob.count());
		
		Integer[] ob1 = {10,20,30};
		Stream sint = Arrays.stream(ob1);
		
		sint = Arrays.stream(ob1).map(k->k*k);
		sint.forEach(System.out::println);
		
	}

}