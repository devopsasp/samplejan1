package cab;

class Cab
{ 
	String msg;
	public Cab(String msg)
	{
		this.msg=msg;
	}
}

class CabRunner implements Runnable
{
	Cab cab;
	public CabRunner(Cab cab)
	{
		this.cab=cab;
	}
	
	public void run()
	{
		synchronized(cab)
		{
			System.out.println("cab acquired with message "+cab.msg);
			 try{
				 //cab.wait(3000);
				 cab.wait();
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 }
			
		}
	}
	
}

class CabNotifier implements Runnable
{
	Cab cab;
	public CabNotifier(Cab cab)
	{
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
			try{
				//cab.notifyAll();
			 cab.notify();
				System.out.println("cab notified ..");
			}
		
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	}
}
public class CabDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Cab cab=new Cab("Cab to station");
   CabRunner runner=new CabRunner(cab);
   CabRunner runner1=new CabRunner(cab);
   CabNotifier notifier=new CabNotifier(cab);
   Thread t1=new Thread(runner);
   Thread t3=new Thread(runner1);
   Thread t2=new Thread(notifier);
   t1.start();
   t3.start();
    try{
    	Thread.sleep(3000);
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
   t2.start();
	}

}
