package oop;

public class methods {
	public static void myFunc() {
		System.out.println("Love the way you lie");
	}
	public static String getParamFunc(String name) {
		return name;		
	}
	public static int getParamFunc(int age) {
		return age;		
	}
	public static void main(String[] args) {
		myFunc();
		System.out.println(getParamFunc("sahadev dahit"));
		System.out.println(getParamFunc(23));
	}

}
