package array;

public abstract class ArrayFloat {

	public static void main(String[] args) 
	{
		float a[]= {1.2f,2.5f,10.3f,20.3f};
		for(int i=0; i<=a.length-1; i++)
		{
			int v=(int)a[i]; //narrowing
			System.out.println(v);
		}
	}

}
