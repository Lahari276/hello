package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriaInheritance {
	
	private static final String FILE_NAME = "inheritance.txt";
	
	public static void main(String[] args) throws Exception {
		Rabbit r = new Rabbit();
		r.i = 999;
		r.j = 276;
		r.k = 786;
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(r);
		System.out.println("begin of deserialize");
		FileInputStream fis = new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Rabbit r1 = (Rabbit)ois.readObject();
		System.out.println("rabit variables i = " + r1.i + " j = " + r1.j + " k = " + r1.k);;
	}
}
