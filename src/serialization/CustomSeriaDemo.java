package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSeriaDemo {
public static void main(String[] args) throws Exception {
	Account acc = new Account();
	
	FileOutputStream fos = new FileOutputStream("testout.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(acc);
	
	FileInputStream fis = new FileInputStream("testout.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Account a2 = (Account)ois.readObject();
	System.out.println("username= "+ a2.user + " password = " + a2.password);;
	
}
}
