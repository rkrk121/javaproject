package String;

import java.util.Scanner;

public class ReverseStrng {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s= sc.nextLine();
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		
           System.out.println(rev);
	}

}
