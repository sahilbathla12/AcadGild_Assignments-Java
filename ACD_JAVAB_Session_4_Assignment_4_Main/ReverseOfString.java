package session4;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String str = "Sahil Bathla";
		
		System.out.println("String is "+str);
		int strLength=str.length();
		String reverse="";
		for (int i =  strLength-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println("Reversed String Is :");
		System.out.println(reverse);
				
	}
}
