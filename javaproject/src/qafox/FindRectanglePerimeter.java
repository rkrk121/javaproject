package qafox;

import java.util.Scanner;

public class FindRectanglePerimeter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the height of the Rectangle");
		double height = sc.nextDouble();
		
		System.out.println("Enter the width of the Rectangle");
		double width=sc.nextDouble();
		
		System.out.println("Perimeter of the rectangle "+2*(height*width));
	}

}
