import java.lang.System;
import java.lang.String;
import java.lang.Math.*;
import java.util.Scanner;

public class ex5{
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		double P,r,t,n,A;
		
		System.out.println("The principal amount is ");
		P=scan.nextDouble();
		System.out.println("The rate of interest is");
		r=scan.nextDouble();
		System.out.println("The time period is");
		t=scan.nextDouble();
		System.out.println("N");
		n=scan.nextDouble();
		
		A=P*Math.pow((1+r/n),n*t);
		
		System.out.println("The total amount after the time period is" + A);		
	}
}