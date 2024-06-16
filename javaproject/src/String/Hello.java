package String;

public class Hello {

	public static void main(String[] args) 
	{
		/*
		 * output
		 * H_e__l___l___o
		 */
		String s="Hello";
		String a="";
		for(int i=0; i<s.length(); i++)
		{
			a=a+" ";
			System.out.print(s.charAt(i)+a);
			
		}
		
		

	}

}
