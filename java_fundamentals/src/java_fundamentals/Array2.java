package java_fundamentals;

public class Array2 {

	public static void main(String[] args) {
		        int[] numbers = {10, 25, 5, 90, 42}; 

		        int max = numbers[0];
		        int min = numbers[0];

		        for (int num : numbers) {
		            if (num > max)
		                max = num;
		            if (num < min)
		                min = num;
		        }

		        System.out.println("Maximum: " + max);
		        System.out.println("Minimum: " + min);
		    }
	}


