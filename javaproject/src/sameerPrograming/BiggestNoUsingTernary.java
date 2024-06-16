package sameerPrograming;

public class BiggestNoUsingTernary {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		
		int big=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println(big);
		

	}

}
