package oop;

public class Circle 
{
float radius;
public Circle(float radius)
{
	this.radius=radius;
}
public void calculate()
{
	System.out.println("perimeter is "+2*3.14*radius);
	System.out.println("area is "+3.14*radius*radius);
}
public static void main(String [] args)
{
	Circle c1=new Circle(2.5f);
	c1.calculate();
	Circle c2=new Circle(5.5f);
	c2.calculate();
	
	
}
}
