package java_fundamentals;
import java.util.Scanner;
public class Question21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer number: ");
        int rows = sc.nextInt();
        
        System.out.println("Floyd's Triangle:");
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }

	}

}
