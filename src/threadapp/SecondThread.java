package threadapp;

public class SecondThread implements Runnable{
	ResourceA obj;
	ResourceB bobj;
	
	public SecondThread(ResourceA obj,ResourceB bobj)
	{
		this.obj=obj;
		this.bobj=bobj;
	}
	public void run()
	{
		synchronized(bobj)
		{
			bobj.printMessage(obj);
			synchronized(obj)
			{
				obj.printMessage(bobj);
			}
		}
	}

}
