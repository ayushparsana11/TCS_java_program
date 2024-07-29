package Day9_Final_Abstract;

public class Subtraction extends MyTest {
	private int no1,no2;
	
	public Subtraction(){
		no1=17;
		no2=4;
	}
	
	@Override
	public void showResult(){
		System.out.println("Substraction : "+(no1-no2) );
	}
}
