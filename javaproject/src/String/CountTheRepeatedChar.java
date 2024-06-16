package String;

public class CountTheRepeatedChar {

	public static void main(String[] args) 
	{
		//String s = "ABca123a2AA";
		String s="karnataka";
		int count=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			if(s.charAt(i)=='a')
				//if(s.charAt(i)=='a' || s.charAt(i)=='A')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
