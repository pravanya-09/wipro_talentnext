package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class Ary2 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Array size: ");
		        int n = sc.nextInt();

		        boolean all14 = true;
		        for (int i = 0; i < n; i++) {
		            int x = sc.nextInt();
		            if (x != 1 && x != 4) all14 = false;
		        }
		        System.out.println(all14);
		    }
		}


	


