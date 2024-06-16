package framework;

import java.util.HashMap;

public class CityEx {

	public static void main(String[] args)
	{
		HashMap<Integer,String> h=new HashMap();
		h.put(814160, "Godda");
		h.put(816107, "pakur");
		h.put(814165, "sahebganj");
		System.out.println("All key");
		System.out.println(h.keySet());
		System.out.println("All value");
		System.out.println(h.values());
		System.out.println("All Maping");
		System.out.println(h.entrySet()); //or  s.o.p(h);
		System.out.println(h.containsKey(814161));
		System.out.println(h.containsKey(814160));
		System.out.println(h.containsValue("Godda"));
		System.out.println(h.containsValue("dumka"));
		System.out.println(h.remove(814160));
		System.out.println("After removing"+h.entrySet());
		System.out.println(h.get(816107));
		System.out.println(h.get(814160));
		
		

	}

}
