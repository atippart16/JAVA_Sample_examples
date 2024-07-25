import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex23_4 {
	public static void main(String args[]) {
		int[] arr = {2,4,6,8,10};
		Scanner scan= new Scanner(System.in);
		int target;
		System.out.println("Enter the number to be found:");
		target = scan.nextInt();
		int left = 0;
        int right = arr.length - 1;
        int result = -1; // Variable to store the result
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Target found at index mid
                break;
            }

            if (arr[mid] < target) {
                left = mid + 1; // Ignore the left half
            } else {
                right = mid - 1; // Ignore the right half
            }
        }

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
		
	}
}
