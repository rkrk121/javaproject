package framework;

import java.util.ArrayList;

public class B {

	public static void main(String[] args) 
	{
		ArrayList<String> ob=new ArrayList<String>();
		ob.add("manual");
		ob.add("sql");
		ob.add("java");
		System.out.println("Elements");
	    for(int i=0;i<=ob.size()-1;i++)
	    {
	    	System.out.println(ob.get(i));
	    }

	}

}
