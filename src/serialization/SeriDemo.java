package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriDemo {
public static void main(String[] args) {
	Dog d1 = new Dog();
	try {
		FileOutputStream fos = new FileOutputStream("testout.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
	} catch (Exception e) { e.printStackTrace();
		// TODO: handle exception
	}
	// de-serialization
	FileInputStream fis;
	try {
		fis = new FileInputStream("testout.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println(d2.i + "\t" + d2.j);
	} 
	catch (FileNotFoundException e) {e.printStackTrace(); }
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	catch (ClassNotFoundException e ) { e.printStackTrace(); }
	
}
}
