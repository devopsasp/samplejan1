package threadapp;

public class ThreadDemo extends Thread{

	  public void run()
	  {
		  System.out.println("Child Thread started");
		  System.out.println(".........");
		  System.out.println("Child Thread ended");
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th=Thread.currentThread();
		System.out.println(th.getName()+" has Started");
		ThreadDemo obj=new ThreadDemo();
        obj.start();
        
        

	}

}
