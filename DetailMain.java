package Day10_Bank_Activity;

public class DetailMain implements Name,Age{
	@Override
	public void printname(){
		System.out.println("Name : "+name);
	}
	
	@Override
	public void printdata(){
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args){
		DetailMain ob = new DetailMain();
		ob.printname();
		ob.printdata();
	}
}
