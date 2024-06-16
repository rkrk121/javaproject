package Exception;
import java.util.Scanner;

public class Matrimony 
{
public static void register()
{
	System.out.println("Enter the age");
	Scanner a=new Scanner(System.in);
	int age=a.nextInt();
	if(age<21)
	{
		throw new InvalidAgeException("age is not eligible");
	}
	else
	{
		System.out.println("Register sucessful");
	}
}
public static void main(String[] args) 
{
	try
	{
		Matrimony.register();
	}
	finally
	{
		System.out.println("Thank you visit again");
	}
	System.out.println("continue to upload detail");
}
}
