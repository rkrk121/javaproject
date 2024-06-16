package String;

public class CheckLetter1 {

	public static void main(String[] args) 
	{
		String a[]= {"java","manual","sql","web","project","salenium"};
		for(int i=0; i<=a.length-1; i++)
		{
			a[i]=a[i].toUpperCase();
			System.out.println(a[i]);
		}

	}

}
