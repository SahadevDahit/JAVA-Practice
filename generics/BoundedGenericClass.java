package generics;

class Programming{
	public void display() {
		System.out.println("This is from the programming");
	}
}

class Java extends Programming{
	public void display() {
		System.out.println("Java is a stable and high level programming langauge");
	}
}

//This allows to take instance of Programming class and it's sub class
class hobby<T extends Programming>{  
	T myhobby;
	
	hobby(T hobby){
		this.myhobby=hobby;
	}
	
	public void display() {
			myhobby.display();
	}
}


public class BoundedGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming p=new Programming();
		Java java=new Java();
		hobby<Programming> pl=new hobby<Programming>(p);
		hobby<Java> obj=new hobby<Java>(java);
	    obj.display();
		pl.display();
		

	}

}
