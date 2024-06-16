package String;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="BtmsecondstageBanglore560029@#^";
		String str="";
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
//			if(s.charAt(i)>='0' && s.charAt(i)<='9')
//			{
//				str=str+s.charAt(i);
//			}
			
			if(!((s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')))
				{
					str=str+s.charAt(i);
					
				}
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				s1=s1+s.charAt(i);
			}
			
			
		}
		System.out.println(s1);
		System.out.println(str);
	}
	}
