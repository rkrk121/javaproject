package oop;

public class Mobile 
{
String brand;
String model;
String colour;
int price;
public Mobile(String brand,String mode,String colour,int price)
{
	this.brand=brand;
	this.model=model;
	this.colour=colour;
	this.price=price;
}
public static void main(String [] args)
{
	Mobile m1=new Mobile("samsung","m31","black",5000);
	Mobile m2=new Mobile("vivo","E24","grey",7000);
	m1.details();
	m1.discount();
	m2.details();
	m2.discount();
}
public void details()
{
	System.out.println(".......offer for you.......");
	System.out.println("mobile brand is "+brand);
	System.out.println("mobile model is "+model);
	System.out.println("mobile colour is "+colour);
	System.out.println("mobile price is "+price);
	}
public void discount()
{
	double amount=price*0.8;
	System.out.println("discount price "+amount);
}


}
