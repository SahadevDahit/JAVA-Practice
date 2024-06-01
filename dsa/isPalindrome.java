package dsa;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="vanav";
		String newString="";
		for(int i=0;i<str.length();i++) {
			if(Character.isLetterOrDigit(str.charAt(i))) {
				newString+=str.charAt(i);
			}
		}
		
		System.out.println(str.length());
		
		for(int i=0; i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				System.out.println("not palindrome");
				break;
			}
		}
		System.out.println("palindrome");		
	
	}
}
