package sameerPrograming;

public class NestedForLoop {

	public static void main(String[] args) 
	{
//		for(int i=1; i<=3; i++)
//		{
//			System.out.println(i);
//			for(int j=1; j<=5; j++)
//			{
//				System.out.println(j); // 1 12345 2 12345 3 12345
//			}
//		}
//------------------------------------------------------------------------------------
		for(int i=1; i<=3; i++)
		{
			System.out.print(i);
			for(int j=1; j<=5; j++)
			{
				if(j==3)
					break;
				System.out.print(j); //1 1 2 2 1 2 3 1 2
			}
		}
		

	}

}
