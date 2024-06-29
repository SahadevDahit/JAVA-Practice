package oop;

public class isSubString {
	public static boolean isSubString(String main,String sub) {
//		return main.matches("(.*)"+sub+"(.*)");
		return main.contains(sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main="This is awsome";
		String sub="is";
		System.out.println(isSubString(main, sub));

	}

}
