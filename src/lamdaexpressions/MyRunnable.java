package lamdaexpressions;

public class MyRunnable implements Runnable { 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
		System.out.println("in myrunnable thread");
	}
	}
	/*
	 * //()-> { for(int i=0; i<5; i++) { System.out.println("in the thread"); }
	 * 
	 * }
	 */
}
