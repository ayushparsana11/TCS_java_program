package Day9_Final_Abstract;

public class Division extends MyTest{
	private int no1,no2;
	
	public Division(){
		no1=100;
		no2=5;
	}
	
	@Override
	public void showResult(){
		System.out.println("Division : "+(no1/no2) );
	}
}
