package oop;

public class char_count {
public static void main(String[] args) {
	String text="This is Awsome. Now We Can DO I";
	
//	long count=text.chars().filter(e->(char)e=='i').count();
//	System.out.println(count);
	
	int count=0;
	for(int i=0;i<text.length();i++) {
//		if(Character.isUpperCase(text.charAt(i))) {
//			count++;
//		}
//		if(text.charAt(i)>='A' && text.charAt(i)<='Z') {
//			count++;
//		}
		
		
	}
	// using the stream
//			long count1=text.chars().filter(e->Character.isUpperCase(e)).count();
	long count1=text.chars().filter(e->Character.isUpperCase(e)).count();
			System.out.println(count1);
	
	
}
}
