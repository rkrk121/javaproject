package inheritence;

public class User 
{
String name;
long contact1;
long contact2;
public User(String name,long contact1,long contact2)
{
	this.name=name;
	this.contact1=contact1;
	this.contact2=contact2;
	System.out.println("constructor with 3 argument");
}
public User(String name,long contact1)
{
	this(name,contact1,0);
	System.out.println("constructor with 2 argument");
}
public void display()
{
	System.out.println("NAME IS "+name);
	System.out.println("CONTACT 1 IS "+contact1);
	System.out.println("CONTACT 2 IS"+contact2);
}
public static void main(String [] args)
{
	User u=new User("tina",6234565433l);
	u.display();
}
}
