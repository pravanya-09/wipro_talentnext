package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Array6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

	}

}
