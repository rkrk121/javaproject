package Exception;

public class C {

	public static void main(String[] args) 
	{
		System.out.println(10/2); 
	try
	{
		System.out.println(10/0);  //risky code
	}
	catch(ArrayIndexOutOfBoundsException ob)  //it is arithmatic exception so that execution terminate
	{
	}
	System.out.println(10/5);
}
}
