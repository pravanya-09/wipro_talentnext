package java_fundamentals;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("is positive");
		}
		else if(num<0){
			System.out.println("is negative");
		}
		else
			System.out.println("Zero");

	}

}
