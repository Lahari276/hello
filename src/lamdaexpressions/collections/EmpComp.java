package lamdaexpressions.collections;

import java.util.Comparator;

public class EmpComp implements Comparator<Employee>{
@Override
public int compare(Employee e1, Employee e2) {
	// TODO Auto-generated method stub
	if(e1.eid <e2.eid) return -1;
	else if(e1.eid > e2.eid) return 1;
	else return 0;
	
	/*(e1,e2)-> (e1.eid <e2.eid)? -1
			: (e1.eid >e2.eid)? 1
			:  0;*/
			
}
}
