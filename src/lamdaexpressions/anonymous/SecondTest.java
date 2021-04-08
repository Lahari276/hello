package lamdaexpressions.anonymous;

public class SecondTest {
public static void main(String[] args) {
	Person employee = new Person() {
		@Override
		void eat() {
				System.out.println("anonymous person eating");
		}
		
	};
	Thread t = new Thread()
	{
		public void run() {
		
	System.out.println("child thread");
	}
	};
	t.start();
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("in runnable");
		}
	};
	Thread t1 = new Thread(r);
	t1.start();
}
}
