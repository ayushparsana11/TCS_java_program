package Day18_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Color> lstColor = new ArrayList<Color>();
		lstColor.add(new Color(1,"White"));
		lstColor.add(new Color(2,"Black"));
		lstColor.add(new Color(3,"Blue"));
		lstColor.add(new Color(4,"Red"));
		lstColor.add(new Color(5,"Green"));
		lstColor.add(new Color(6,"Yellow"));
		
		for(Color clr : lstColor){
			System.out.println(clr);
		}
		
		System.out.println();
		
		Collections.sort(lstColor);
		lstColor.forEach(k -> System.out.println(k));
	}
}
