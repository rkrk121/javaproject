package array;

public class Narrawing 
{
public static void main(String[] args) 
	{
	int a[]= {97,98,99,100,101};
	for(int i=0; i<=a.length-1; i++)
	{
    char ch=(char)a[i]; //narrowing
    System.out.println(ch);
}
}
}