package qafox;

import java.util.Scanner;

public class AreaOfCircle 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of circle");
		
		double radius = sc.nextDouble();
		sc.close();
		System.out.println("Area of the circle " +radius+ "is:"+(Math.PI*radius*radius) );
	}

}
