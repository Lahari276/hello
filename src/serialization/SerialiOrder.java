package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialiOrder {
public static void main(String[] args) throws Exception {
	Dog d = new Dog();
	cat c = new cat();
	rat r = new rat();
	FileOutputStream fos = new FileOutputStream("testout.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d);
	FileInputStream fis = new FileInputStream("testout.txt");
	ObjectInputStream ois= new ObjectInputStream(fis);
	System.out.println(d.i + "\t" + d.j);
	System.out.println(r.l);
	System.out.println(c.k + "\t" + c.j);

}
}
