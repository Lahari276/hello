package inbuilt.functional.interfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentTest {
	static ArrayList<StudentFunc> js;
	public static void main(String[] args) {
		populateStudents();
		Function<StudentFunc, String> f = (j) -> {
			if(j.marks >80) return "distinction";
			else if (j.marks >60) return "first class";
			return "pass";
		};
		
		for(StudentFunc s : js) {
			System.out.println(s.name + "\t" + f.apply(s));;
		}
		}
	private static void populateStudents() {
		// TODO Auto-generated method stub
		js = new ArrayList<StudentFunc>();
		js.add(new StudentFunc("lahari",70));
		js.add(new StudentFunc("reddy",50));
		js.add(new StudentFunc("hyma",75));
		js.add(new StudentFunc("srujan",80));
		js.add(new StudentFunc("chinnu",95));

	}
}
