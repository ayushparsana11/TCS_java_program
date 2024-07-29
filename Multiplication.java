package Day9_Final_Abstract;

public class Multiplication extends MyTest{
	private int no1,no2;
	
	public Multiplication(){
		no1=10;
		no2=4;
	}
	
	@Override
	public void showResult(){
		System.out.println("Multiplication : "+(no1+no2) );
	}
}
