import java.lang.System;
import java.lang.String;
import java.lang.Math.*;
import java.util.Scanner;

public class ex2{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double r,h,area;
		System.out.println("The radius is");
		r=scan.nextDouble();
		System.out.println("The height is");
		h=scan.nextDouble();
		
		area = 2*Math.PI*(r*h+Math.pow(r, 2));
		
		System.out.println("The area of the cylinder is" + area);
		
	}
}