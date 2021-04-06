package fileio;
import java.io.FileInputStream;

public class DataStreamExample {
	public static void main(String args[]){    
        try{    
          FileInputStream fin=new FileInputStream("d:\\testout.txt");    
          int i=fin.read();  
          System.out.print((char)i);    

          fin.close();    
        }catch(Exception e){System.out.println(e);}    
       }    
}