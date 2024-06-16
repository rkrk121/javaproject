package oop;

public class Pen 
{
static String brand;
String colour;
int price;
public Pen() //explict constructor without argument
{
	System.out.println("pen detail are loading");
}
public static void main(String[] args)
{
	Pen p1=new Pen();
	Pen p2=new Pen();
	Pen p3=new Pen(); //3 pen objects are created
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);     //printing address of pen objects
}
}
