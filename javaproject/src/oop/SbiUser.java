package oop;

public class SbiUser 
{
static String bank="sbi";
long acno;
long contact;
double balance;
public SbiUser(long acno,long contact,double balance)
{
	this.acno=acno;
	this.contact=contact;
	this.balance=balance;
}
public static void main(String[] args)
{
	SbiUser a=new SbiUser(898765432567l,9876567889l,860);
    SbiUser b=new SbiUser(898765472567l,9876667889l,868);
    a.details();
    b.details();
}
public void details()
{

	System.out.println("bank"+SbiUser.bank);
	System.out.println("acount number"+acno);
	System.out.println("balance"+balance);
	System.out.println("contact"+contact); 
}

}

