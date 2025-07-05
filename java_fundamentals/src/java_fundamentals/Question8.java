package java_fundamentals;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("A");
		int A=sc.nextInt();
		System.out.println("B");
		int B=sc.nextInt();
		boolean result=(A%10)==(B%10);
		System.out.println("last digit " + " ( " + A + " , " + B + " ) " + " is " + result);
		

	}

}
