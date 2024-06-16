package String;

public class DigitPrint {

	public static void main(String[] args) {
		String str="Banglore Btm 560029";
		String digit="";
		for (Character ch : str.toCharArray()) 
		{
			if(Character.isDigit(ch))
			{
				digit=digit+ch;
			}
			
		}
		System.out.println(digit);

	}

}
