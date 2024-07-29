package Day22;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambda l = () -> {System.out.println("hello world");};
		l.g1();
	    Cal1 c1 = () -> System.out.println(17+4);
	    c1.getTotal();  
		Cal2 c2 = (int no) -> no*no;  System.out.println("Square : "+c2.getSquare(17));
		
	}

}
