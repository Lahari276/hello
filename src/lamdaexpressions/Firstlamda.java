package lamdaexpressions;

//import java.util.function.Function;

public class Firstlamda {
	public static void main(String[] args) {
		int sq = sqareIt(4);
		System.out.println(sq);
		
		IsSum is = (a,b)->a+b;
		System.out.println(is.add(3, 5));
		
				
		FuncInterfaces f1 = ()->System.out.println("hello");
		f1.m();
		/*
		 * Function<Integer, Integer> f = n-> n*n;
		 * //Function<Integer, Integer> g = add -> a+b;
		System.out.println(f.apply(5));
		//System.out.println(g.apply(7));
		 */
		
		
	}
	public static int sqareIt(int n) {
		return n*n;
	}
	
	public static void m() {
		System.out.println("hii");
		// ()-> System.out.println(hello);
	}
	public static int add(int a, int b) {
		//(a,b)-> a+b;
		return a+b;
	}
}
