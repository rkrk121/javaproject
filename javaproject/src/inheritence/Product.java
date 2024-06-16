package inheritence;

public class Product 
{
String id;
String brand;
String model;
int price;
public Product(String id,String brand,String model,int price)
{
	this.id=id;
	this.brand=brand;
	this.model=model;
	this.price=price;
	System.out.println("4 argument here");
}
public Product(String id,String brand,int price)
{
	this(id,brand,null,price);
	System.out.println("3 argument here");
}
public Product(String id,String brand)
{
	this(id,brand,0);
	System.out.println("2 argument here");
}
public Product()
{
	System.out.println("o argument here");
}
public void display()
{
	System.out.println("ID IS "+id);
	System.out.println("BRAND IS "+brand);
	System.out.println("MODEL IS "+model);
	System.out.println("PRICE IS "+price);
}
public static void main(String [] args)
{
	Product p1=new Product("abc123","adidas");
	Product p2=new Product("rah321","nike",3200);
	Product p3=new Product("sam454","hrx","hrx654h",1800);
	p1.display();
	p2.display();
	p3.display();
}
}

