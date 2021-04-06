package collections;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p=null;
		try
		{
		FileReader reader=new FileReader("C:\\Users\\LAHARI\\eclipse-workspace\\DxcNiit\\src\\collections\\db.properties");
	      
	    p=new Properties();  
	    p.load(reader);  
		}catch(IOException e) {
			e.printStackTrace();
		}
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}

}