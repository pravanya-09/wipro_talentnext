package oops;

class Ques_9{
	public static String repeatEnd(String str,int n ) {
		String lastPart = str.substring(str.length() - n);
		String result=" ";
		for(int i=0;i<n;i++) {
			result += lastPart;
			}
		return result;
		}
public static void main(String[] args) {
	System.out.println(repeatEnd("Wipro", 3));
		}

	}


	

	

