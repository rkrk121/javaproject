package inheritence;

public class Student extends Person
{
int id;
String course;
public Student(String name,int age,long contact,int id,String course)
{
	super(name,age,contact);
	this.id=id;
	this.course=course;
	System.out.println("student details are loading");
}
public void profile()
{
	System.out.println("The student id is" +id);
	System.out.println("The student course is" +course);
}
}
