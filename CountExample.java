package Day16_Syncronisation;

class CounterNo{
	int cnt;
	public synchronized void get_Increment(){
		cnt++;
	}
}

public class CountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterNo cn = new CounterNo();
		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i = 0; i < 1000; i++){
					cn.get_Increment();
					try{
						Thread.sleep(1);  // Reduced sleep time
					}catch(Exception e){
						System.out.println(e);
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i = 0; i < 1000; i++){
					cn.get_Increment();
					try{
						Thread.sleep(1);  // Reduced sleep time
					}catch(Exception e){
						System.out.println(e);
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final counter value: " + cn.cnt);
	}

}
