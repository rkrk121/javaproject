package array;

public class SumOfEachDigit {

	public static void main(String[] args) 
	{
	
			int a[]= {100,200,50,20};
		   
		    for(int i=0; i<=a.length-1; i++)
		    {
		    	 int sum=0;
		    	 while(a[i]!=0) {
		    		 int rem=a[i]%10;
		    	sum=sum+rem;
		    	a[i]=a[i]/10;
		    	
		    }
		    	 a[i]=sum;
		  
			}
		    System.out.println("the sum"+ sum);

	}

}
