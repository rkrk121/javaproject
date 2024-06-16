package oop;

public class User1 
{
String fname;
String lname;
long pcontact;
long scontact;
public User1(String fname,String lname,long pcontact,long scontact)
{
	this.fname=fname;
	this.lname=lname;
	this.pcontact=pcontact;
	this.scontact=scontact;
}
public User1(String fname,String lname,long pcontact)
{
	this.fname=fname;
	this.lname=lname;
	this.pcontact=pcontact;
	}
public void profile()
{
	System.out.println("FIRST NAME IS "+fname);
	System.out.println("LAST NAME IS " +lname);
	System.out.println("PRIMARY CONTACT "+pcontact);
	System.out.println("SECONDARY CONTACT "+scontact);
}
public static void main(String [] args)
{
	User1 a=new User1("Rahul","kumar",9876546542l,8790876563l);
	User1 b=new User1("Rohit","sharma",9876546672l,8790878963l);
	a.profile();
	b.profile();
	
}
}
