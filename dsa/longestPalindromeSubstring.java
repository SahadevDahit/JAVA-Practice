package dsa;

public class longestPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String s="vanav";
		   StringBuilder reversedStringBuilder = new StringBuilder(s);
		   StringBuilder reversed= reversedStringBuilder.reverse();
		   String reversedString = reversed.toString();
		   // Compare the original string with its reversed version
		    if (s.equals(reversedString)) {
		        System.out.println("The string is a palindrome.");
		    } else {
		        System.out.println("The string is not a palindrome.");
		   }
	}

}
