package Exception;

public class I {

	public static void main(String[] args)
	{
		int a=10;
		int b=2;
		if(b==2)
		{
			throw new ArithmeticException("division by 2");
		}
		else
		{
			System.out.println(a/b);
		}
		System.out.println("ok");
		

	}

}
