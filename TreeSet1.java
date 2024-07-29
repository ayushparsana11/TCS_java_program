package Day19_Set;

import java.util.*;
import Day18_Comparable.*;
public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tr1 = new TreeSet<String>();
		TreeSet<Integer> tr2 = new TreeSet<Integer>();
		TreeSet<Color> tc1 = new TreeSet<Color>();
		
		tr1.add("Peacock");
		tr1.add("Parrot");
		tr1.add("Dove");
		tr1.add("Sparrow");
		
		tr1.forEach(t -> System.out.println("String Tree Set " +t));
		
		tr2.add(4);
		tr2.add(17);
		tr2.add(2);
		tr2.add(18);
		
		tr2.forEach(t -> System.out.println("Integer Tree Set : "+ t));
		
		System.out.println("Subset of Integer TreeSet");
		
		System.out.println(tr2.subSet(1,true, 5,true));
	}

}