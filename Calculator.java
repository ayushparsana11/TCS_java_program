package Day8_Static_Keyword;

public class Calculator {
	static int count=0;
	int ct=0;
	
	public Calculator(){
		count++;
		ct++;
	}

	@Override
	public String toString() {
		return "ct= " + ct + "count = "+ count;
	}
	
	
}
