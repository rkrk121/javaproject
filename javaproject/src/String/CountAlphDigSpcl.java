package String;

import java.util.Scanner;

public class CountAlphDigSpcl {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc1.nextLine();
		int ac=0;
		int dc=0;
		int sc=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				ac++;
			else if(ch>='0' && ch<='9')
				dc++;
			else
				sc++;	
		}
		System.out.println("Alphabat character is"+ac);
		System.out.println("digit character is"+dc);
		System.out.println("Special character is"+sc);
		
		

	}

}
