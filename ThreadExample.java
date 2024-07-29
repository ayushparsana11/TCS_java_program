package Day14_thread;

class Thread1 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Hello");
		}
	}
}

class Thread2 implements Runnable{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Hii");
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th1 = new Thread1();
		th1.start();
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);
		th.start();
	}

}