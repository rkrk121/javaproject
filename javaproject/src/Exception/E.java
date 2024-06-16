package Exception;

public class E {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(40/0);
		}
		catch(ArithmeticException ob)
		{
			System.out.println("First");
			}
		catch(Exception ob)
		{
			System.out.println("second");
		}
		System.out.println("continue");

	}

}
