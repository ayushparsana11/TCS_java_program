package exceptionexample;

public class ExceptionExcercise {
	public static void main(String[] args){
		
		try{
			int[] arr = new int[5];
			for(int i : arr){
				arr[5] = 30/5;
			}
			System.out.println("Ans : "+arr[5]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Exception "+e);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		finally{
			System.out.println("Program Run successfully");
		}
	}

}
