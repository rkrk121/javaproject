package Exception;

public class G {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10+20);
			System.out.println(10/2);
			System.out.println(10+3);
			}
		catch(ArithmeticException ob)
		{
			System.out.println(100+200);
		}
		System.out.println("continue");

	}

}
