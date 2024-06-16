package String;

public class MinimumShortestLengthInArray {

	public static void main(String[] args) 
	{
		String []s= {"ab","abc","abcd","cd","cdgf"};
		String minLength=s[0];
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()<minLength.length())
			{
				minLength=s[i];
			}
		}
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()==minLength.length())
			{
				System.out.println(s[i]+" ");
			}
			
		}
		

	}

}
