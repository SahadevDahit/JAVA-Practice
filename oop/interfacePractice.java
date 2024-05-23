package oop;

// interface is used to acheive the multiple inheritance
interface animal{
	public void walk();
	public int num=0;
	
}

class deer implements animal{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Deer walk with the four legs........");
		
	}
	
}
class chicken implements animal{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Chicken walk with the two legs........");
		
	}
	
}
public class interfacePractice {
	public static void main(String[] args) {
		deer d1=new deer();
		d1.walk();
		
		chicken c1=new chicken();
		c1.walk();
		
	}

}
