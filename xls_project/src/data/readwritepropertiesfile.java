package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readwritepropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f =new FileInputStream("C:\\Users\\Vrajesh\\Documents\\testing\\prop.properties");
		Properties prop=new Properties();
		prop.load(f);
		
		String s=prop.getProperty("browser");
		System.out.println(s);
		
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println("url");
		
		prop.setProperty("FirstName", "Swapnil");
		System.out.println(prop.getProperty("FirstName"));
		
		prop.setProperty("LastName", "Patel");
		System.out.println(prop.getProperty("LastName"));
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Vrajesh\\Documents\\testing\\prop.properties");
		prop.store(fo, "Adding these comments");
		
		
	}

}
