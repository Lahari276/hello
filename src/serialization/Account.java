package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
String user = "lahari";
transient String password = "reddy";
	private void writeObject(ObjectOutputStream oos) throws IOException,ClassNotFoundException {
		oos.writeUTF("123" + user + "," + "456" + password);
		//oos.writeUTF(",456" + password);
		
	}
	private void readObject(ObjectInputStream ois) throws IOException{
		String[] unPwd = ois.readUTF().split(",");
		this.user = unPwd[0].substring(3);
		this.password = unPwd[1].substring(3);
		
	}
}
