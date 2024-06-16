package oop;

public class Product 
{
String brand;
String productid;
float price;
public Product()
{
	System.out.println("product details are loading");
}
public static void main(String[] args)
{
	Product p1=new Product();
	System.out.println(p1);
	Product p2=new Product();
	System.out.println(p2);
}
}
