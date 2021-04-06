package generics;
public class TestOb {
public static void main(String[] args) {
	Gen<String> g1 = new Gen<String>("lahari");
	g1.show();
	System.out.println(g1.getOb());
	
	Gen<Integer> g2 = new Gen<Integer>(new Integer(10));
	g2.show();
	System.out.println(g2.getOb());
	
	Gen<?> g3 = new Gen<Integer>(new Integer(30));
	g3.show();
	System.out.println(g3.getOb());
	
	Gen<? super String> g4 = new Gen<Object>("Hello");
	g4.show();
	System.out.println(g4.getOb());
	
	Gen<? extends Number> g5 =new Gen<Integer>(new Integer(3));
	g5.show();
	System.out.println(g5.getOb());
	
	//Test<Integer> myTest = new Test<Integer>(10,20) ;
	Test<MyNumber> myTest = new Test<MyNumber>(new MyNumber(), new MyNumber());
	
}
}