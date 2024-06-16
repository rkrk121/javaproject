package framework;

import java.util.ArrayList;

public class E {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("HellO");
		a.add("sql");
		a.add("salenium");
		a.add("java");
		a.add("Hola");
		a.add("project");
		System.out.println("Elements which contains o");
		for(int i=0; i<=a.size()-1; i++)
		{
			if(a.get(i).indexOf('o')!=-1 || a.get(i).indexOf('O')!=-1)
			{
				System.out.println(a.get(i));
			}
		}
	}

}
