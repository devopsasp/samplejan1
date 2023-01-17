package threadapp;

public class CharThread extends Thread{
	public void run()
	{
		for(char c='A';c<='Z';c++)
		{
			System.out.println(c);
			System.out.println("Thread running "+Thread.currentThread().getName());
			if(Thread.currentThread().getName().equals("first"))
			{
				Thread.yield();
			}
		}
	}

}
