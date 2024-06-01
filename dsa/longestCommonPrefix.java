package dsa;

public class longestCommonPrefix {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String[] strs= {"flow","flower","flight"};
		
		String prefix=strs[0];
		for(int i=1;i<strs.length;i++) {
			if(prefix=="") {
				return "";
			}
			
			String tempStr="";
			int searchSize=Math.min(prefix.length(), strs[i].length());
			
			String tempString="";
			
			for(int j=0;j<searchSize;j++) {
				if(prefix.charAt(j)!=strs[i].charAt(j)) {
					break;
				}
				tempString+=prefix.charAt(i);
			}
			prefix=tempString;
			
		}
		return prefix;

	}

}
