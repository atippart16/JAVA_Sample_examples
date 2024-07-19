import java.lang.System;
import java.lang.String;
import java.lang.Math.*;
import java.util.Scanner;

public class ex3{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double r,h,s,area;
		System.out.println("The radius is");
		r=scan.nextDouble();
		System.out.println("The height is");
		h=scan.nextDouble();
		
		s=Math.sqrt(Math.pow(r, 2)+Math.pow(h, 2));
		
		area = Math.PI*r*(r+s);
		
		System.out.println("The area of the cone is" + area);
		
	}
}