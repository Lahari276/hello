package lamdaexpressions.defaultstatic;

public class OtherList implements ICollection{
@Override
public void add() {
	// TODO Auto-generated method stub
	System.out.println("add method of otherlist");
}
@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("remove method of otherlist");
	}
@Override
	public void append() {
		// TODO Auto-generated method stub
		//ICollection.super.append();
	System.out.println("otherlist appending");
	}
}
