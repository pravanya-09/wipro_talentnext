package java_fundamentals;

public class Question9 {
	public static void main(String[] args) {
		 if (args.length == 0) {
	            System.out.println("bangalore,mumbai");
	        } else {
	            for (int i = 0; i < args.length; i++) {
	                System.out.print(args[i]);
	                if (i != args.length - 1) {
	                    System.out.print(",");
	                }
	            }
	        }
	    }
	}
	
