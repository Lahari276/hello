package method.reference;

public class PlaySum {
	public static void main(String[] args) {
		MyInterface r = MyInterfaceMethodRefn::add;
r.add(10,20);	
		
	}
}
