package lamdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListNum {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(5);
	al.add(6);
	al.add(27);
	al.add(9);
	al.add(8);
	al.add(7);
	System.out.println(al);
	Comparator<Integer> c = (o1,o2)->(o1 < o2)? -1 : (o1 > o2)? 1 : 0;
	Collections.sort(al,c);// new Comapator = c
	System.out.println(al);
}
}
//comparator --- int comapreTo(Object o1,Object o2)
//o1 to come before o2 then return a +ve no
//o2 to come before o1 then return a -ve no
// o1=o2 then return 0