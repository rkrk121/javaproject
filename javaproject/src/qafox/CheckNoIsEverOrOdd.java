package qafox;      //Wajp to check whether  the given input is even or odd

import java.util.Scanner;

public class CheckNoIsEverOrOdd {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("No. Given by user is even number:"+num);
		}
		else
		{
			System.out.println("No. is given by user is odd number:"+num);
		}
		

	}

}
