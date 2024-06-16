package oop;

public class User 
{
	static String social="facebook";
String username;
long contact;
public User(String username,long contact)
{
	this.username=username;
	this.contact=contact;
}
public static void main(String [] args)
{
	User a=new User ("rkrk@gmail.com",9876543210l);
	User b=new User ("rkrk121@gmail.com",9876543211l);
	System.out.println(User.social);
	System.out.println(a.username);
	System.out.println(a.contact);
	System.out.println(b.username);
	System.out.println(b.contact);
	
	
}
}
