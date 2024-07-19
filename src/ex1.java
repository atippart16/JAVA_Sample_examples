import java.lang.System;
import java.lang.String;
import java.lang.Math.*;
import java.util.Scanner;

public class ex1{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double a,b,c,s,area;
		System.out.println("The value of a is ");
		a=scan.nextDouble();
		System.out.println("The value of b is ");
		b=scan.nextDouble();
		System.out.println("The value of c is ");
		c=scan.nextDouble();

		s=(a+b+c)/2;
		
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("The area of the triangle is "+ area);
		
				
	}
}
	