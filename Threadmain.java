package Day15;

class A extends Thread{
 @Override
 public void run(){
  for(int i=2;i<=20;i=i+2){
   System.out.println("Even No : "+i);
   try{
    Thread.sleep(100);
   }catch(Exception e){
    System.out.println(e);
   }
  }
 }
}

class B extends Thread{
 @Override
 public void run(){
  for(int i=1;i<=20;i=i+2){
   System.out.println("Odd : "+i);
   try{
    Thread.sleep(100);
   }catch(Exception e){
    System.out.println(e);
  }
 }
}
}

public class Threadmain {
 public static void main(String[] args){
  A thread1 = new A();
  B thread2 = new B();
  
  thread1.setName("Th1");
  thread2.setName("Th2");
  
  System.out.println(thread1.getName());
  System.out.println(thread2.getName());
  
  thread1.start();
  System.out.println(thread1.isAlive());
  
  try{
   thread1.join();
  }catch(Exception e){
   System.out.println(e);
  }
  
  System.out.println(thread1.isAlive());
  thread2.start();
  
  System.out.println("Printed");
 }
}