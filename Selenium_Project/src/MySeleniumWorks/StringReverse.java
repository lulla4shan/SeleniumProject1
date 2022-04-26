package MySeleniumWorks;

public class StringReverse {
	public static String reverseOfString(String string) {
		StringBuilder builder = new StringBuilder();
		builder.reverse();
		return builder.toString();
	}
	public static void main(String[] args) {
		
		System.out.println(StringReverse.reverseOfString("ansala"));
		
		}

	

}
