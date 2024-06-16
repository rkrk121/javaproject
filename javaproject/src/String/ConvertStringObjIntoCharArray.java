package String;

import java.util.Arrays;

public class ConvertStringObjIntoCharArray {

	public static void main(String[] args) 
	{
		String s="God";
		char []a=new char[s.length()];
		
		for(int i=0; i<=s.length()-1; i++)
		{
			a[i]=s.charAt(i);	
		}
		System.out.println(Arrays.toString(a));
		

	}

}
