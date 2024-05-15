package oop;

public class runnableThread implements Runnable{

	public static void main(String[] args) {
		runnableThread obj=new runnableThread();
		Thread thread = new Thread(obj);
	    thread.start();
	    System.out.println("This code is outside of the thread");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("This code is running in a thread");
		
	}

}
