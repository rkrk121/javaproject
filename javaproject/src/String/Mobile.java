package String;

public class Mobile 
{
String brand;
double price;
public Mobile(String brand,double price)
{
	super();
	this.brand=brand;
	this.price=price;
}
public String toString()
{
	return brand+"";
}
public static void main(String [] args)
{
	Mobile m1=new Mobile("oppo",39900);
	Mobile m2=new Mobile("samsung",49900);
	Mobile m3=new Mobile("apple",39900);
	Mobile a[]= {m1,m2,m3};
	System.out.println("Details of the mobile with brand contains p");
	for(Mobile i:a)
	{
		if(i.brand.indexOf('p')!=-1)
		{
			System.out.println(i);
		}
	}
}
}
