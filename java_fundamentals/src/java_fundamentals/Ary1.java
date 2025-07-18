package java_fundamentals;
import java.util.Scanner;
import java.util.ArrayList;

public class Ary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        evenList.addAll(oddList);
        System.out.print("Rearranged array: [");
        for (int i = 0; i < evenList.size(); i++) {
            System.out.print(evenList.get(i));
            if (i < evenList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}

	


