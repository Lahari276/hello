package inbuilt.functional.interfaces;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate
{
	public static ArrayList<Employee> employees;
	public static void main(String[] args)
	{
	Predicate<Integer> p = i->i%2==0;
	System.out.println(p.test(10));
	populateEmployees();
	Predicate<Employee> p1=(e)->e.salary >=30000;
	for(Employee e:employees) 
	{
		if(p1.test(e)) 
		{
			System.out.println(e.name);
		}
	}
	
}
	public static void populateEmployees()
	{
		employees=new ArrayList<Employee>();
		employees.add(new Employee("ram",50000));
		employees.add(new Employee("srujan",25000));
		employees.add(new Employee("lahari",30000));
		employees.add(new Employee("reddy",40000));

	}
}