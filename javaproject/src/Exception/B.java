package Exception;

public class B {

	public static void main(String[] args) 
	{
		System.out.println(10/2);
		try
		{
			System.out.println(10/0);  //risky code
		}
		catch(ArithmeticException ob)   //catching the through exception
		{
			System.out.println(10/5);    //code execution continue after handling exception
		}

	}

}
