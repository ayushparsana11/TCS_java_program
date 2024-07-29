package Day9_Final_Abstract;

public class Addition extends MyTest{
	private int no1,no2;
	
	public Addition(){
		no1=17;
		no2=4;
	}
	
	@Override
	public void showResult(){
		System.out.println("Addition : "+(no1+no2) );
	}
}
