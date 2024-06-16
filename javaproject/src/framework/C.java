package framework;

import java.util.ArrayList;

public class C {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("voilet");
		a.add("indigo");
		a.add("green");
		a.add("yellow");
		System.out.println(a);
		System.out.println(a.size());
		ArrayList<String> b=new ArrayList<String>();
		b.add("white");
		b.add("pink");
		b.add("black");
		System.out.println(b);
		System.out.println(b.size());
		a.addAll(2,b);
		System.out.println("afterbadding b into a now is"+a);
		System.out.println(a.size());
		System.out.println(a);
		a.clear();
		System.out.println(a);
}
}
