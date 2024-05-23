package oop;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String quotes="Everyone has the dream. You must dare to imagine";
			String[] quote=quotes.split(" ");
			String reverse="";
			for(int i=quote.length-1; i>0;i--) {
				reverse+=" "+quote[i];
			}
			System.out.println(reverse);
	}

}
