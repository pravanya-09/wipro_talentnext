package java_fundamentals;

public class Array3 {

	public static void main(String[] args) {
		        int[] arr = {1, 4, 34, 56, 7};
		        int searchElement = 4; 

		        int index = -1;

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == searchElement) {
		                index = i;
		                break;
		            }
		        }

		        System.out.println(index);

	}

}
