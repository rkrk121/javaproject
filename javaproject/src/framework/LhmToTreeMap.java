package framework;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LhmToTreeMap 
{
public static void main(String[] args) 
{
	LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer,String>();
	h.put(814160, "Godda");
	h.put(816107, "pakur");
	h.put(814165, "sahebganj");
	System.out.println("All key"+h.keySet());
	System.out.println("All value"+h.values());
	System.out.println("All maping in insertion order"+h.entrySet());
	System.out.println("Using for loop");
	for(Integer i:h.keySet())
	{
		System.out.println(i+" "+h.get(i));
	}
	TreeMap<Integer,String> t=new TreeMap<Integer,String>(h);
	System.out.println("All passing into treemap now shorted order");
	System.out.println(t.entrySet());
	System.out.println(t.firstEntry()); //getting first key value pair
	System.out.println(t.lastEntry());  //getting last key value pair
	
	
}
}
