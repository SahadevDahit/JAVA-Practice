package generics;

//Define a generic class with a type parameter T

class Box<T>{
	T length,breadth;
	Box(T l,T b){
		this.length=l;
		this.breadth=b;
	}
	
	public T getLength() {
		return length;
	}
	
	public T getBreadth() {
		return breadth;
	}
}


public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Box<Integer> box=new Box<Integer>(23,67);
	System.out.println("Length -->"+box.getLength());
	
	Box<String> box1=new Box<>("Length","breadth");
	System.out.println(box1.getBreadth());
	
	Box<Float> box2=new Box<Float>(2.3f,4.5f);
	System.out.println(box2.getLength());

	}

}
