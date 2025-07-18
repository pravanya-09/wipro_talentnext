package oops;

public class Ques_6 {

	public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
       
        String result = comboString("hi", "hello");
        System.out.println("Output: " + result);
		

	}
}


