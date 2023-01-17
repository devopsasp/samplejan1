package threadapp;

public class MultiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharThread t1=new CharThread();
		CharThread t2=new CharThread();
		t1.setName("first");
		t2.setName("second");
		t1.setPriority(Thread.NORM_PRIORITY+2);
		t2.setPriority(Thread.NORM_PRIORITY+3);
		t1.start();
		t2.start();

	}

}
