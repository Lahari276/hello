package inbuilt.functional.interfaces.predicates;

import java.util.function.Predicate;

public class ChainPredicates {
public static void main(String[] args) {
	Predicate<Integer> p1 = i->i%2==0;
	Predicate<Integer> p2 = i->i>=10;
	int[] intArray = {5,7,27,18,13,19,26,24};
	// int c = 20;
	System.out.println("if no > 10 and is even print");
	
	for (int i : intArray) {
		if(p1.and(p2).test(i)) {
			System.out.println(i);
		}
	}

}
}
