package collections;
//import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ConcurrentDemo extends Thread{
//static ArrayList<String> arrayList=new ArrayList<String>();
	static Vector<String> arrayList=new Vector<String>();
	@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	arrayList.add("SOME");
}
	public static void main(String[] args)throws InterruptedException {
		arrayList.add("A");
		arrayList.add("BBB");
		arrayList.add("CC");
		arrayList.add("DDD");
		ConcurrentDemo concurrentDemo=new ConcurrentDemo();
		concurrentDemo.start();
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			String s=iterator.next();
			System.out.println(s);
			Thread.sleep(6000);
		}
		System.out.println(arrayList);
		
	}
}