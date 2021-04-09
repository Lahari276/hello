package inbuilt.functional.interfaces.unarybinaryoperators;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {
	
	public static void main(String[] args) {
		Function<Integer,Integer> f = i -> i*i;
		System.out.println(f.apply(6));
		
		UnaryOperator<Integer> uo = i-> i*i;
		System.out.println(uo.apply(4));
		
		IntUnaryOperator iuo = i -> i*10;
		System.out.println(iuo.applyAsInt(8));
	}

}