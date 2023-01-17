package threadapp;

public class JoinDemo extends Thread{
	
	public JoinDemo()
	{
		setName("ChildThread");
			
	}
	public void run()
	{
   try
   {
	   System.out.println(getName()+" has  started ...");
	   Thread.currentThread().join();
   }
   catch(Exception e)
   {
	   
   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println(Thread.currentThread().getName()+"started...");
		JoinDemo t1=new JoinDemo();
		t1.start();
		
	}

}
