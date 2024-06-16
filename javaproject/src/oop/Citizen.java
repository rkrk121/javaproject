package oop;

public class Citizen
{
String name;
String state;
long contact;
String gender;
public Citizen(String name,String state,long contact,String gender)
{
	this.name=name;
	this.state=state;
	this.contact=contact;
	this.gender=gender;
}
public Citizen(String name,String state,long contact)
{
	this.name=name;
	this.state=state;
	this.contact=contact;
}
public Citizen(String name,String state)
{
	this.name=name;
	this.state=state;
}
public void view()
{
	System.out.println(".....details......");
	System.out.println("name is "+name);
	System.out.println("state is "+state);
	System.out.println("contact  is "+contact);
	System.out.println("gender is "+gender);
}
public static void main(String[] args) 
{
Citizen a=new Citizen("rahul","jharkhand",9876567888l,"male");
Citizen b=new Citizen("rohit","bihar",9876567568l);
Citizen c=new Citizen("rhohini","Delhi");
a.view();
b.view();
c.view();

}
	
}
