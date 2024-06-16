package sameerPrograming;

public class LeapYear {

	public static void main(String[] args) {
		
		for(int year=2000; year<=2500; year++)
		{
			if(year%4==0 && year%100!=0)
			{
				System.out.println(year);	
			}
			else if(year%400==0)
			{
				System.out.println(year);
			}
		}

	}

}
