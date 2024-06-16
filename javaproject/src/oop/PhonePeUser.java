package oop;

public class PhonePeUser 
{
public void login()
{
	System.out.println("user login in phonePe");
	this.checkBalance();
}
public void checkBalance()
{
	System.out.println("user can check their Balance");
}
public static void main(String[] args)
{
	PhonePeUser obj=new PhonePeUser();
	obj.login();
}
}