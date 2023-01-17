package threadapp;
import java.util.*;
public class CustomerThread extends Thread{

	public void acceptDetails()
	{
		System.out.println("Enter customer details");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String address=sc.nextLine();
		System.out.println("Name "+name);
		System.out.println("address "+address);
	}
	   public void run()
	   {
		   acceptDetails();
	   }
}
