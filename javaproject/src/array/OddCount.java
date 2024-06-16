package array;

public class OddCount 
{
public static void main(String[] args)
{
	int a[]= {22,63,76,87};
int n=0;
for(int i=0; i<=a.length-1; i++)
{
	if(a[i]%2!=0)
	{
		n++;
	}
}
System.out.println("the odd numberis "+ n);
	}

}
