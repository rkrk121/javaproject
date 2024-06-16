package inheritence;

public class QEmployee 
{
String name;
String eid;
long contact;
double salary;
String branch;
public QEmployee(String name,String eid,long contact,double salary,String branch)
{
	this.name=name;
	this.eid=eid;
	this.contact=contact;
	this.salary=salary;
	this.branch=branch;
}
public void profileE()
{
	System.out.println("NAME IS "+name);
	System.out.println("EID IS "+eid);
	System.out.println("CONTACT IS "+contact);
	System.out.println("SALARY IS "+salary);
	System.out.println("BRANCH IS "+branch);
}
}
