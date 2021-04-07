package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization implements Externalizable {
	String s =  "reddy";
	int i,j=7;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(s);
		out.writeInt(27);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.s = (String)in.readObject();
		this.i = in.readInt();
		
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Externalization ex = new Externalization();
		FileOutputStream fos = new FileOutputStream("externdemo");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ex);
		
		FileInputStream fis = new FileInputStream("externdemo");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Externalization e1 = (Externalization) ois.readObject();
		
		System.out.printf("i= %d, j= %d, s= %s",e1.i,e1.j,e1.s);
	}

}
