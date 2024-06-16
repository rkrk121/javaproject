package framework;
import java.util.ArrayList;
public class Student 
{
String name;
float per;
int id;
public Student(String name, float per, int id) 
{
	super();
	this.name = name;
	this.per = per;
	this.id = id;
}
public String toString()
{
return name+" "+per+" "+id;	
}
public static void main(String[] args) 
{
	ArrayList<Student> a=new ArrayList<Student>();
	Student s1=new Student("Tina",78.2f,102);
	a.add(s1);
	Student s2=new Student("sam",68.2f,107);
	a.add(s2);
	Student s3=new Student("Alex",88.2f,106);
	a.add(s3);
	for(Student i:a)
	{
		if(i.per>70)
		{
			System.out.println(i);
		}
	}
	
	}

}
