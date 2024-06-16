package array;

public class ArraySum 
{
public static void main(String[] args) 
{
	int a[]= {100,200,50,20};
    int sum=0;
    for(int i=0; i<=a.length-1; i++)
    {
    	sum=sum+a[i];
    }
    System.out.println("the sum"+ sum);
	}

}
