package String;

public class CountDigitString {
	public static void main(String[] args) {
		String s="abc123";
		//char[] ch=s.toCharArray();
		int dig=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				dig=dig+ch-48;
			}
		
		
		}
		
		System.out.println(dig);
	}


}
