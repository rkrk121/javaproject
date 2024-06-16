package array1;

public class MinimumNumber {

	public static void main(String[] args) 
	{
		int[] a = { 10, 5, 7, 3, 1, 8 };
		int fmin=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(fmin>a[i])
			{
				fmin=a[i];
			}
		}
		System.out.println(fmin);
		

	}

}
