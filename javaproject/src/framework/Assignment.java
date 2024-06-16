package framework;

import java.util.HashSet;
import java.util.TreeSet;

public class Assignment 
{
public static void main(String[] args) 
{
	HashSet<Integer> a=new HashSet<Integer>();
	a.add(12);
	a.add(89);
	a.add(89);
	a.add(78);
	TreeSet<Integer> b=new TreeSet<Integer>(a);
	System.out.println(b);
	System.out.println(b.descendingSet());
	
	
}
}
