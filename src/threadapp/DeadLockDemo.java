package threadapp;

public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceA obj=new ResourceA();
		ResourceB bobj=new ResourceB();
	FirstThread t1=new FirstThread(obj,bobj);
	SecondThread t2=new SecondThread(obj,bobj);
	Thread th1=new Thread(t1);
	Thread th2=new Thread(t2);
	th1.start();
	th2.start();
	
	}
	
	

}
