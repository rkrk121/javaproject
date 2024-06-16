package Exception;

public class F {

	public static void main(String[] args) 
	{
		int a=12;
		try
		{
			System.out.println(a+2);
			System.out.println(a/0);
		}
		catch(ArithmeticException ob)
		{
			System.out.println("first");
		}
		System.out.println(a+10);

	}

}
