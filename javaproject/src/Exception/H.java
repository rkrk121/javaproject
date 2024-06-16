package Exception;

public class H {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
			System.out.println(10/2);
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
		
		}
		finally
		{
			System.out.println("hello");
		}


	}

}
