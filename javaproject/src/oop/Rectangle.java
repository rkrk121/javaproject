package oop;

public class Rectangle 
{
int length;
int breath;
public Rectangle(int length,int breath)
{
	this.length=length;
	this.breath=breath;
}
public void findArea()
{
	System.out.println("Rectangle area is "+length*breath);
}
public static void main(String[] args)
{
	Rectangle r1=new Rectangle(5,6);
	r1.findArea();
	Rectangle r2=new Rectangle(8,7);
	r2.findArea();
	
}
}
