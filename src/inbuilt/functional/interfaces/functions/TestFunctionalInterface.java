package inbuilt.functional.interfaces.functions;

import java.util.function.Function;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		Function<Integer,Integer> f = i -> i*i;
		System.out.println(f.apply(5));
		
		Function<String, Integer> f2 = s-> s.length();
		System.out.println("length of word--" + f2.apply("Lahari"));
		
		Function<String,String> f3 = s ->s.toUpperCase();
		System.out.println("in upper case--" + f3.apply("laharireddy"));
	}
}
