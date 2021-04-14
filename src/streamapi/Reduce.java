package streamapi;

import java.util.Arrays;

public class Reduce {
	public static void main(String[] args) {
		
	
	int[] numbers = {1, 2, 3, 4, 5, 6, 7};

	  // 1st argument, init value = 0
	  int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
	
	  System.out.println(sum);
	}
	
}
