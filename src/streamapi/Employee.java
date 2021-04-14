package streamapi;


public class Employee {
	//implements Comparable<Employee>{
		
		String name;
		int salary;
		
		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name + ":"+ this.salary;
					//super.toString();
		}

		
		  public int compareTo(Employee o) { // +ve no if you want o to come
		   return (this.salary > o.salary) ? 1 :(this.salary < o.salary) ? -1 : 0;
		  }
		 

	}