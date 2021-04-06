package generics;

import java.util.ArrayList;

public class Firstex {
public static void main(String[] args) {
	String[] stu = new String[3];
	stu[0]="Reddy";
	//stu[1]=10;
	ArrayList stlist = new ArrayList();
	stlist.add("lahari");
	stlist.add(new Integer(10));
	System.out.println(stlist);
	String name = (String) stlist.get(1);
	System.out.println(name);
}
}
