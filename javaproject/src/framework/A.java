package framework;

import java.util.ArrayList;

public class A 
{
public static void main(String[] args) 
{
	ArrayList<Object> a=new ArrayList();
	a.add("hi");
	a.add(123);
	a.add('A');
	a.add(null);
	a.add(22.2f);
	a.add(123);
	a.add("hi");
	System.out.println(a);
//	for(int i=0; i<a.size()-1;i++)
//	{
//		System.out.println(a.get(i));
//	}
	
	for(Object i:a)
	{
		System.out.println(i);
	}
	
}
}
