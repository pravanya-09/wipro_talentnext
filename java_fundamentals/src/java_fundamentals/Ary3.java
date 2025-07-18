package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Ary3{
    public static void main(String[] args) {
    	        Scanner sc = new Scanner(System.in);
    	        int[] a = new int[3];
    	        int[] b = new int[3];
    	        System.out.println("Enter 3 integers for array a:");
    	        for (int i = 0; i < 3; i++) {
    	            a[i] = sc.nextInt();
    	        }
    	        System.out.println("Enter 3 integers for array b:");
    	        for (int i = 0; i < 3; i++) {
    	            b[i] = sc.nextInt();
    	        }
    	        int[] result = middleWay(a, b);
    	        System.out.println("Middle elements = " + Arrays.toString(result));
    	        sc.close();
    	    }
    	    public static int[] middleWay(int[] a, int[] b) {
    	        return new int[] { a[1], b[1] };
    	    }
    	}

    
