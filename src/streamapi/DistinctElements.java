package streamapi;

import java.util.Arrays;
import java.util.List;

public class DistinctElements {
	public static void main(String[] args)
    {
  
        
        List<Integer> list1 = Arrays.asList(1,1,6,8,6,2,2,3,3,4,5,10,5,5);
        //list1.add(1);
        List<String> string = Arrays.asList("lahari","reddy","hyma","reddy","alekhya","srujan","srujan","siri");

        System.out.println("The distinct elements for strings are :");
        string.stream().distinct().forEach(System.out::println);
  
        System.out.println("The distinct elements for integers are :");
        list1.stream().distinct().forEach(System.out::println);
        long Count = list1.stream().distinct().count();
        System.out.println("Count of distinct elements in integers are" + Count);
    }
}
