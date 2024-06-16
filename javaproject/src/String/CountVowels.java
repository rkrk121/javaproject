package String;

public class CountVowels {

	public static void main(String[] args) 
	{
		String st="india";
		char []ch=st.toCharArray();
		
		int count=0;
		for(int i=0; i<=st.length()-1; i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
				System.out.println(ch[i]+ " ");
			}
		}
		System.out.println(count);
	

	}

}
