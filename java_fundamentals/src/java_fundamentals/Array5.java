package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Array5 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] array = new int[n];
	        
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }
	        
	        Arrays.sort(array);
	        System.out.println("Smallest 2: " + array[0] + ", " + array[1]);
	        System.out.println("Largest 2: " + array[n - 2] + ", " + array[n - 1]);

	}

}
