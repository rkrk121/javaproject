package array1;

public class FirstMaxNo 
{
	public static void main(String[] args) {
		int a[]= {10,5,15,3,1,8};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("First maximum no" +a[0]);
	}

}
