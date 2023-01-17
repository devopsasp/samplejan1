package threadapp;

public class NumberThread implements Runnable {
	
	int i=0;
	public void run()
	{
		for(i=0;i<10;i++)
		{
			System.out.println(i);
			try{
				Thread.sleep(2000);
				Thread t=Thread.currentThread();
				if(t.getName().equals("second"))
				{
					t.join();
				}
				System.out.println(t.getName());
			}
			catch(InterruptedException e)
			{	
				System.out.println(e);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
NumberThread runner=new NumberThread();

		Thread t1=new Thread(runner);
		Thread t2=new Thread(runner);
 t1.setName("first");
 t2.setName("second");
		t1.start();
		 t2.start();
		
	}

}
