package String;

public class Demo {
	public static void main(String[] args) {
		String s="  ram is good";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length-1;i++)
		{
			if(i==0 && ch[i]!=' ' ||ch[i]!=' '  && ch[i-1]==' ')
				count ++;
		
		
		}
		
		System.out.println(count);
	}

}
