import java.util.Arrays;
import java.util.ArrayList;

public class ex23_1{
	public static void main(String args[]) {
			int[] arry = {1,2,3,4,5,2,3,6,7,7};
			int[] set = new int[arry.length];
			ArrayList<Integer> dup = new ArrayList<>();
			for(int i=0;i<arry.length;i++) {
				if (contains(set,arry[i])){
					dup.add(arry[i]);}
				else {
					set[i]=arry[i];
				}
			}	
			System.out.println("The duplicate elements in the list are:" + dup);
			
	}
    public static boolean contains(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

}