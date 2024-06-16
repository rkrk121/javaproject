package inheritence;

public class ExecuitePS {

	public static void main(String[] args) 
	{
		Student s=new Student("Alex",25, 9878786540l, 2454, "testing course");
		s.details();
		s.profile();
		Person p=new Person("Tina", 24, 9089765476l);
		p.details();

	}

}
