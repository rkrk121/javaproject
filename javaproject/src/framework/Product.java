package framework;

import java.util.ArrayList;

public class Product 
{
String brand;
int price;
public Product(String brand, int price) {
	super();
	this.brand = brand;
	this.price = price;
}
@Override
public String toString() {
	return "Product [brand=" + brand + ", price=" + price + "]";
}
public static void main(String[] args) 
{
	ArrayList<Product> a=new ArrayList<Product>();
	a.add(new Product("vivo",2500));
	a.add(new Product("samsung",3000));
	a.add(new Product("apple",5000));
	for(Product p:a)
	{
		System.out.println(a);
	}
			
}


	}
