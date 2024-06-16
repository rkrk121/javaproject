package oop;

public class Product1 
{
String brand;
String pid;
float price;
public Product1(String b,String id,float p)
{
	brand=b;
	pid=id;
	price=p;
	}
public static void main(String [] args)
{
	Product1 p1=new Product1("nestle","123",10.5f);
	Product1 p2=new Product1("camlin","121",105.5f);
	System.out.println(p1);
	System.out.println(p2);
}
}
