class StringPalindromeOptimize {

	public static boolean isPalindrom(String input) {
		int left = 0;
		int right = input.length()-1;
		while(left < right) {
			if(input.charAt(left) != input.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
		
	}
	public static void main(String args[]) {

		String input = "marun";
		boolean result = isPalindrom(input);
		if(result)
			System.out.println("Given String is palindrome");
		else
			System.out.println("Given String is not Palindrome");	
	}
}
//presentation points
//why String is immutable?
//frquently used string functions/methods?
//object class - equals & hashcode
//write a customer class with 2 attribute id & name override equals and hashcode

