package inheritence;

public class Person 
{
String name;
int age;
long contact;
public Person(String name,int age,long contact)
{
	this.name=name;
	this.age=age;
	this.contact=contact;
	System.out.println("person details are loading");
}
public void details()
{
	System.out.println("The Person name is" +name);
	System.out.println("The person age is" +age);
	System.out.println("The person contact no" +contact);
}
}
