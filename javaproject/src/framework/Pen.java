package framework;

import java.util.ArrayList;

public class Pen 
{
String brand;
int price;
public Pen(String brand, int price)
{
	this.brand = brand;
	this.price = price;
}
public String toString() 
{
	return "Pen brand=" + brand + ", price=" + price ;
}
public static void main(String[] args) 
{
ArrayList<Pen> a=new ArrayList<Pen>();
a.add(new Pen("cello",35));
a.add(new Pen("camlin",15));
a.add(new Pen("parker",350));
a.add(new Pen("cello",25));
System.out.println("pen details with cello as brand and price less than 30");
for(Pen i:a)
{
	if(i.brand.equalsIgnoreCase("cello")&& i.price<30)
	{
	System.out.println(i);
	
	}
}
   
}

}

