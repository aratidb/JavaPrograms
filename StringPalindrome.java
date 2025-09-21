import java.util.*;
class StringPalindrome { 
	public static void main(String args[]) {
		String name = "madam";
		//char []reverse = new char[name.length()];
		int length = name.length();
		int count = 0;
		String s ="";
		for(int i=length-1;i>=0;i--) {
			s = s + name.charAt(i); 
		}
		//String palindrom = reverse.toString();//Arrays.toString(reverse);
		System.out.println("Palindrome string: "+s); // String.valueOf(palindrom));
		if(name.equals(s))
			System.out.println("Given String is palindrome");
		else
			System.out.println("Given String is not Palindrome");	
	}
}