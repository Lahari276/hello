package inbuilt.functional.interfaces.functions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {
	static ArrayList<StudentFunc> js = StudentTest.populateStudents();
	
	public static void main(String[] args) {
		Consumer<StudentFunc> c = s->System.out.println(s.name);
		Predicate<StudentFunc> p = s->s.marks >=60;
		
		for(StudentFunc s : js) {
			if (p.test(s)) 
				c.accept(s);
		}
	}
}
