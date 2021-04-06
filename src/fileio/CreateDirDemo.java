package fileio;

import java.io.File;

public class CreateDirDemo {
public static void main(String[] args) {
	File file=new File("C:\\");
	String[] directories;
	directories =file.list();
	for(String path:directories) 
	{
		System.out.println(path);
	}
	String dirPath="d:\\lahari";
	File d=new File(dirPath);
	d.mkdir();
}
}