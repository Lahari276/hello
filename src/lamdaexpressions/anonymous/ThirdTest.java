package lamdaexpressions.anonymous;

public class ThirdTest {
public static void main(String[] args) {
	Interfacez i = new Interfacez() {
		
		@Override
		public void m2() {
			// TODO Auto-generated method stub
			System.out.println("m2 -- interface");
		}
		
		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println("m1 -- interface");
		}
	};
	i.m1();
	i.m2();
}
}
