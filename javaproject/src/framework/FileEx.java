package framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEx {

	public static void main(String[] args) throws IOException
	{
		File f=new File("D:\\FileHandling\\A.txt");
		PrintWriter p=new PrintWriter(f);
		p.println("Hello this is the last class");
		p.println("All the bet for sallenium");
		p.print("hi");
		p.print("Bye");
		p.close();
		FileReader r=new FileReader(f);
	    BufferedReader b= new BufferedReader(r);
		String s=b.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=b.readLine();
		}

	}

}
