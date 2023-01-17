package threadapp;

public class MutilThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerThread t1=new CustomerThread();
		DiscountThread t2=new DiscountThread();
		t1.start();
		t2.start();
	}

}
