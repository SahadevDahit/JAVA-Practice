package oop;
class Test{
	public static final int x=10;
	static {
		System.out.println("from the static block");
	}
}
public class static_final {
public static void main(String[] args) {
	System.out.println(Test.x);
}
}
