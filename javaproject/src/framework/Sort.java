package framework;
import java.util.*;

import java.util.ArrayList;
public class Sort 
{

	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Bat");
		a.add("Ball");
		a.add("Bell");
		System.out.println(a);
		Collections.sort(a);
		System.out.println("sorted list"+a);
		System.out.println("printing in descending order already sorted List");
		Collections.reverse(a);
		System.out.println(a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
		
	}

}
