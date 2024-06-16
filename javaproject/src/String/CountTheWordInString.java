package String;

public class CountTheWordInString {

	public static void main(String[] args) {
		                                                                                                      
		String s="e   sala    cup   namdhe";
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(i==0 && s.charAt(i)!=' ' || s.charAt(i)!=' ' && s.charAt(i-1)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		

	}



	}


