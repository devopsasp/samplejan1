package threadapp;

class Cab
{
	String info;
	public Cab(String info)
	{
		this.info=info;
	}
	public String getInfo()
	{
		return info;
	}
}
public class Notifier implements Runnable {
	Cab cab;
	public Notifier(Cab cab)
	{
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
	System.out.println(" Message "+cab.getInfo()+" is in wait");
	try{
		cab.wait();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cab obj=new Cab("Cab-1");

		Notifier n=new Notifier(obj);
 MyNotifier n2=new MyNotifier(obj);
 Notifier n3=new Notifier(obj);
		 Thread t1=new Thread(n);
		 Thread t2=new Thread(n2);
		 Thread t3=new Thread(n3);
		 t1.start();
		 t3.start();
		 try{
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 
		 }
		 t2.start();
		 
	}

}
class MyNotifier implements Runnable
{
	Cab cab;
	public MyNotifier(Cab cab)
	{
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
		try{
			cab.notifyAll();
			System.out.println(cab.getInfo()+" "+"receives notification");
			
		}
	
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	
}
}