package sameerPrograming;

public class SmallestNoUsingTernary {

	public static void main(String[] args) {
		
		 int a=10, b=20, c=30;
		 
		 int small=(a<b && a<c)?a :(b<c)? b:c;
		 
		 System.out.println(small);

	}

}
