package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InstanceOfDemo {
public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("testout.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object o = ois.readObject();
	ois.close();
	if(o instanceof cat ) {
		cat c1 = (cat)o;
	}
	else if (o instanceof Dog) {
		Dog d1 = (Dog)o;
		System.out.printf("dogs variables are %d %d ", d1.i,d1.j);
	}
	else if (o instanceof rat) {
		rat r = (rat)o;
	}
}
}
