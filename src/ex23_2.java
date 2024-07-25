import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;


public class ex23_2{
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int target;
		System.out.println("Enter the element to be found");
		target = scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("The element "+ arr[i] + " is found at index "+i);
			}
		}
		
		
	}
}
