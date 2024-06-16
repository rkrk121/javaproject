package String;

public class Employee 
{
double sallery;
String dept;
public Employee(double sallery, String dept)
{
	super();
	this.sallery=sallery;
	this.dept=dept;
}
public String toString()
{
	return dept+""+sallery;
	}
public static void main(String [] args)
{
	Employee e1=new Employee(45000,"Accounts");
	Employee e2=new Employee(70000,"Accounts");
	Employee e3=new Employee(65000,"HR");
	Employee e4=new Employee(52000,"Admin");
	Employee a[]= {e1,e2,e3,e4};
	System.out.println("Details of the employee");
	for(Employee i:a)
	{
		if(i.dept.indexOf('A')!=-1 && i.sallery>50000)
		{
			System.out.println(i);
		}
	}
	
}
}
