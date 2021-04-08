package lamdaexpressions.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployees {
	
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("reddy",1606));
		employees.add(new Employee("srujan",1704));
		employees.add(new Employee("cherry",2612));
		employees.add(new Employee("lahari",1627));
		employees.add(new Employee("priya",1906));
		
		System.out.println(employees);
		Comparator<Employee> c = (e1,e2)-> (e1.eid <e2.eid)? -1 : (e1.eid >e2.eid)? 1 : 0;
		
		Collections.sort(employees,c);
		System.out.println(employees);
	}

}