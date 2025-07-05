package java_fundamentals;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }
        System.out.println("Array without duplicates: " + set);

	}

}
