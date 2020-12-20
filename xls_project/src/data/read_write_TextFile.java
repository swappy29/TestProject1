package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class read_write_TextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\Vrajesh\\Documents\\Text Files\\temp.txt");
		f.createNewFile();
		
		FileWriter w= new FileWriter("C:\\Users\\Vrajesh\\Documents\\Text Files\\\\temp.txt");
		BufferedWriter out=new BufferedWriter(w);
		out.write("first");
		out.newLine();
		out.write("second");
		out.newLine();
		out.write("third");
		out.newLine();
		out.write("fourth");
		out.newLine();
		out.write("fifth");
		out.newLine();
		out.flush();
		
		
		FileReader r=new FileReader("C:\\\\Users\\\\Vrajesh\\\\Documents\\\\Text Files\\\\temp.txt");
		BufferedReader read=new BufferedReader(r);
		System.out.println(read.readLine());
		System.out.println(read.readLine());
		System.out.println(read.readLine());
		System.out.println(read.readLine());
		System.out.println(read.readLine());
		System.out.println(read.readLine());
 
		String x;
		int i=0;
		while((x=read.readLine()) !=null) {
			System.out.println(x);
			i++;
		}
		System.out.println(i);

	}

}
