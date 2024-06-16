package String;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		String s="karnataka";
		for(int i=0; i<=s.length()-1; i++)
		{
			int count=0;
			for(int j=i+1; j<=s.length()-1; j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(s.charAt(i));
			}
			}

	}


}
