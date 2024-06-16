package String;

public class ReverseWord {

	public static void main(String[] args) {
		String s = "My Name Is Rahul";
		String[] sp=s.split(s);
		String rev=" ";
		for (String word : sp) 
		{
			String reverseWord=" ";
			for(int i=word.length()-1; i>=0; i--)
			{
				reverseWord=reverseWord+word.charAt(i);
			}
			rev=rev+reverseWord+" ";
			
		}
		System.out.println(rev);

	}

}
