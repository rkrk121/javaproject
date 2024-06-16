package oop;

public class Bottle 
{
String brand;
String colour;
String quantity;
public Bottle(String brand, String colour, String quantity)
{
	this.brand=brand;
	this.colour=colour;
	this.quantity=quantity;
}
public static void main(String[] args)
{
	Bottle b=new Bottle("milton","green","50");
	System.out.println(b.brand);
	System.out.println(b.colour);
	System.out.println(b.quantity);
}
}
