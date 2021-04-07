package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectGrapgDe {
public static void main(String[] args) throws Exception {
	Dog d = new Dog();
	FileOutputStream fos = new FileOutputStream("test.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d);
	
}
}
