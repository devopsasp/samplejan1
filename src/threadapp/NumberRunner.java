package threadapp;

public class NumberRunner implements Runnable {
	int i;
	
	 public void run()
	{
	
		 System.out.println("current thread "+Thread.currentThread().getName());
		   synchronized(this)
		   {
		 for(i=0;i<10;i++)
		 {
			 System.out.println(i+" "+Thread.currentThread().getName());
			
			 
		 }
		   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberRunner n=new NumberRunner();
		Thread t1=new Thread(n);
		Thread t2=new Thread(n);
		Thread t3=new Thread(n);
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
