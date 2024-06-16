package framework;

import java.util.ArrayList;

public class D 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(123);
		a.add(232);
		a.add(432);
		a.add(543);
		a.add(654);
		a.add(765);
		System.out.println(a);
		System.out.println(a.size());
		for(int i=a.size()-1; i>=0; i--)
		{
			System.out.println(a.get(i));
		}
	}

}
