package threadapp;

public class MyThreadRunner extends Thread{
	
	public void run()
	{
		try{
			System.out.println(getName()+" Thread started....");
			System.out.println(getName()+" Thread goes to sleep...");
			 Thread.sleep(3000);
			 System.out.println(getName()+" Thread ended....");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThreadRunner runner=new MyThreadRunner();
runner.setName("Child Thread");
runner.start();

	}

}
