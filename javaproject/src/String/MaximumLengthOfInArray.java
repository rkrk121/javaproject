package String;

public class MaximumLengthOfInArray {

	public static void main(String[] args) {
		String []s= {"ab","abc","abcd","cd","cdgf"};  //output:abcd cdgf
		String maxLength=s[0];
		
		for(int i=0;i<s.length; i++)
		{
			if(s[i].length() > maxLength.length())
				maxLength=s[i];
		}
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length() == maxLength.length())
			{
				System.out.println(s[i]+" ");
			}
		}
		

	}

}
