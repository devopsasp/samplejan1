package threadapp;

public class RunnableDemo implements Runnable{

	
	public void run()
	{
		System.out.println("Child task ... started");
		System.out.println("........");
		System.out.println("Child task ended");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RunnableDemo obj=new RunnableDemo();
		
		Thread th=new Thread(obj);
		
		th.start();
		
		

	}

}
