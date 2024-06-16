package array;

public class Driver 
{

	public static void main(String[] args) 
	{
		StudentArray s= new StudentArray("123","tina");
		StudentArray t= new StudentArray("112","sam");
		StudentArray u= new StudentArray("102","Allex");
		StudentArray v= new StudentArray("105","john");
		StudentArray a[]= {s,t,u,v};
		System.out.println(".......details........");
		for(int i=0; i<=a.length-1; i++)
		{
			a[i].display();
		}
	}

}
