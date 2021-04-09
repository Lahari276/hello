package inbuilt.functional.interfaces.biparams;

import java.util.function.BiFunction;

import inbuilt.functional.interfaces.Employee;

public class TestBiFunction {
	public static void main(String[] args) {
		BiFunction<Integer, String, Employee> bif = (i,s) ->new Employee(s,i);
		
		Employee e = bif.apply(3427, "reddy");
		System.out.println(e.name);
	}
}
