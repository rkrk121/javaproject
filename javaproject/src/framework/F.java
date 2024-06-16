package framework;

import java.util.ArrayList;

public class F 
{
public static void main(String[] args) 
{
 ArrayList<Integer> a=new ArrayList<Integer>();
 a.add(12);
 a.add(7);
 a.add(19);
 a.add(700);
 System.out.println(a.indexOf(19));
 ArrayList<Integer> b=new ArrayList<Integer>();
 b.add(12);
 b.add(700);
 b.add(300);
// a.addAll(b);
// System.out.println(a);
 a.retainAll(b);
 System.out.println(a);
 
 }
}
