package dsa;

import java.util.HashSet;

public class longestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="pwwkew";
	     
		 HashSet<Character> set=new HashSet<>();
	   
	   int left=0, right=0, maxLength=0;
	   
	   while(right<s.length()) {
		   if(!set.contains(s.charAt(right))) {
			   set.add(s.charAt(right));
			   maxLength=Math.max(maxLength, set.size());
			   right++;
		   }else {
			   set.remove(s.charAt(left));
			   left++;
			}		   
	   }
	   System.out.println(maxLength);
	        
	}

}
