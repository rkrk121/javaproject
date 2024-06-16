package inheritence;

public class Citizen 
{
String name;
long ano;
String state;
int pincode;
public Citizen(String name,long ano,String state,int pincode)
{
	this.name=name;
	this.ano=ano;
	this.state=state;
	this.pincode=pincode;
}
public Citizen(String name,long ano,String state)
{
	this(name,ano,state,0);
	}
public Citizen(String name,long ano)
{
	this(name,ano,null);
}
public static void main(String [] args)
{
	Citizen c1=new Citizen("sam",6767876543l);
	Citizen c2=new Citizen("tina",9876567898l,"jharkhand");
	Citizen c3=new Citizen("alex",6785645678l,"bihar",812123);
	/*no output for getting output wrtie display method and c1.display*/
}
}
