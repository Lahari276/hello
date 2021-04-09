package inbuilt.functional.interfaces;
import java.util.*;
import java.util.function.Predicate;

public class studentpredicate {
	static public ArrayList<Student> students;
	public static void main(String[] args) {
		populateStudents(); 
		Predicate<Student> st = (s) -> (s.m1+s.m2+s.m3)/3 >= 60;
		for(Student s : students) {
			 
				System.out.println(s.name+ " is " + ( st.test(s) ? "Passed":"Failed"));
			
		}
	}

	private static void populateStudents() {
		students = new ArrayList<Student>();
		
		students.add(new Student("lahari", 75, 80,95));
		students.add(new Student("reddy",65, 85, 50));
		students.add(new Student("Srujan",75, 60, 80));
		students.add(new Student("hyma",7, 39, 90));
		
		
	}

}