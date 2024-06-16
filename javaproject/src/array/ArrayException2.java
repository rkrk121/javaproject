package array;

public class ArrayException2 
{

	public static void main(String[] args) 
	{
		float mark[]=new float[3];//0-2
		mark[0]=56.4f;
		mark[1]=90.7f;
		mark[2]=76.0f;
		mark[3]=88.5f;
		for(int i=0; i<=mark.length-1; i++)
		{
			System.out.println(mark[i]);
		}
	}
}
