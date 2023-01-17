package threadapp;

public class DiscountThread extends Thread {

	public void calculate()
	{
		System.out.println(12000+12000*3/100);
	}
	  public void run()
	  {
		  calculate();
	  }
}
