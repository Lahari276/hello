package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayMap {
	public static void main(String[] args) {
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(10);
		m.add(7);
		m.add(27);
		m.add(18);
		m.add(6);
		m.add(70);
		m.add(24);
		System.out.println(m);
		List<Integer> updateMarks = m.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(updateMarks);
		List<Integer> evenNumbers = m.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		Long noStudentMarksLessFifteen = m.stream().filter(i-> i<15).count();
		System.out.println(noStudentMarksLessFifteen+ " of them scored less than 15");
	}
}
