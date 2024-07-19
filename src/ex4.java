import java.lang.System;
import java.lang.String;
import java.lang.Math.*;
import java.util.Scanner;

public class ex4{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double C,F;
		System.out.println("The temperature in Centigrade is");
		C=scan.nextDouble();
		
		F=32+(C*9)/5;
				
		System.out.println("The temperature in Fahrenheit is " + F);
		
	}
}