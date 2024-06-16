package framework;

import java.util.HashSet;

public class Asighnment1 
{
public static void main(String[] args) 
{
	HashSet<Character> a=new HashSet<Character>();
	a.add('A');
	a.add('a');
	a.add('c');
	a.add('B');
	for(Character i:a)
	{
		int value=i;
		System.out.println(value);
	}
}
}
