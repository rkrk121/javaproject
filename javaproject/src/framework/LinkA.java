package framework;

import java.util.LinkedList;

public class LinkA 
{
public static void main(String[] args) 
{
	LinkedList<String> a=new LinkedList<String>();
	a.add("Bat");
	a.add("Ball");
	a.add("Bell");
	a.add("Cat");
	a.add("Ball");
	a.add("cell");
//	System.out.println(a); 
//	System.out.println(a.peek());
//	System.out.println(a.poll());
//	System.out.println(a.peekLast());
//	System.out.println(a);
    System.out.println(a.pollLast());
    System.out.println(a);
}
}
